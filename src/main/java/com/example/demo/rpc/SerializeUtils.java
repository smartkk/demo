package com.example.demo.rpc;

import java.io.*;

public class SerializeUtils {

    /**
     * 序列化
     * @param object
     * @return
     * @throws IOException
     */
    public static byte[] serialize(Object object) throws IOException {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        ObjectOutputStream outputStream = new ObjectOutputStream(os);
        outputStream.writeObject(object);
        outputStream.flush();
        byte[] byteArray = os.toByteArray();
        outputStream.close();
        os.close();
        return byteArray;
    }
    /**
     * 反序列化
     * @param buf
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static Object deSerialize(byte[] buf) throws IOException, ClassNotFoundException {
        ByteArrayInputStream is = new ByteArrayInputStream(buf);
        ObjectInputStream inputStream = new ObjectInputStream(is);
        Object object =  inputStream.readObject();
        inputStream.close();
        is.close();
        return object;
    }

    public static class NetModel implements Serializable {

        private static final long serialVersionUID = 1l;

        private String className;

        private String method;

        private Object[] args;

        private String[] types;

        public String getClassName() {
            return className;
        }

        public void setClassName(String className) {
            this.className = className;
        }

        public String getMethod() {
            return method;
        }

        public void setMethod(String method) {
            this.method = method;
        }

        public Object[] getArgs() {
            return args;
        }

        public void setArgs(Object[] args) {
            this.args = args;
        }

        public String[] getTypes() {
            return types;
        }

        public void setTypes(String[] types) {
            this.types = types;
        }
    }
}


