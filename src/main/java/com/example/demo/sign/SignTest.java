package com.example.demo.sign;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.*;

public class SignTest {

    public static void main(String[] args) {

        String privateKey = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAI+qErzopsslUv9/6OXc+tmRNJtA5Mj+jGgkcEo0GUmAYLtvrMqPAhuU/sQ+2EF2DpgGVm4VoYCQf9limSg/wAsy0NtZqLCsPD1YvRivOWZtXa26oKivEzRzSbudXXydt24YU/02bLnFXjLi8xwGEjspuO1B6bmO88sjMaYrv3x9AgMBAAECgYAHfY2WjebMZrjKG4gwG/J0T47XnW2QUT1O3L+CDu9Wlrv0aeEven9Yos8ZulEaMKaYJJRzDuupwV75HZvwrko79v2dhRRcrzDuJnrBfSaH5S7MKGPo7a1sApi2zC3gnL0tjY8aUV4FC7/2wFTDdoQOF0JOffxyVfEppz8vg8Tw3QJBAOCji2D+31ZeDv/9cIPioV0oAZ0rHIJ6GsTJR1DUPBZMWAIp5aSEDQ4WejOMB5KcF7D2Cwu32WtkkOzdwOpl928CQQCjuIyt092Bf/tLuD4D7gdjd+ArifoJgmxRBds/EzHMb1W2hJqk1paOmR8T+yLjuh66b5d+uLThl8xsqAxKrjTTAkADxFpS/xMptJwVyN85JvTDxib4xr9MpNWMFT//5/819IPJTYCPWLOLV+8mrCN4Xuu6yPV4ddXMijwv7KwOgjU7AkB2kw3IQ5600OVG5Ox9WiKdxs9jmS2vP3eFgvFUkGlLwALbCtUZt5UZOAsLJKMTPdRNgM6+57WRgah7tYYZfGwjAkEAurGxkTpbpt2fRCQq75Q8i221STx0X0dz/8mGZuJDhkgtG71Yi2iJgI+U1ilf8YrJ7ckUWyHL2jXlf0Q+KWNb3g==";
        String privateKey2 = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAOJQhZDB9X6s3nJLiQhgi1KP2sfpC8pxa59XHph++TibYk0uyLIzBtDovHsUgo4DKfuk4deLZW93qixyX142nKnNVu4FU+oUFHzxZb+riyCKjmyQQrt3nzaZPFD/zL+pBXozw90DlHCHmsEFVWURhw0oklgryskpz9jXVB+yzZ6PAgMBAAECgYEAjF7XSV8Ubtq4KnoxZ5HCOJZjY8Vne8x3rWAy6PEwkWzHPwo6j1TY8HC6nzisdXr+6kdtkOy0ILw/P8w83MnQxtKV2joxye063PoCICnKdz1KafBK4Lj8Dg/Y6U65m4UIydBXZge4C8PKc4NEVMEx9B2noCmw6DW3FDQlA2nJMTECQQD3D6WMaq9qxI3uUejvxTYtfY68y9F/99qvx7wq3ITQygksFNA3/a3oyG/CQQner5ldtta3yZOeHla+pSuGv49XAkEA6oC2zbEyWrxWMKKgzkjkGUdCYpieqLFvbFY5lCWgpRRSCAXEwpUh4dkN3vBbl5B/x5WOlQR3O/rnSdFPqWi/iQJAdl8gym4zLcyO1Ciamoa6toD56qsc7VsrhB0GouKVIBQs4Nn4CVuZ/3ZJVaEjwXYQ3T3FErmZ6KBQn3czq5QMcQJABE32jRIKnZXFc0EY+JBn93rSYiLxDqGrLO7sQabrKvyTgOgyM2wvYgjs80GwPLj/T3eUVXHuimBRrI42CyMMGQJAQJaZwjCHkfJPDeOFz45EWDyvnlT2kBdZW+WhlqwCUXn4U9eNTML1OEUyNiXWN+Nc1nvNOORyxxbhqGj+ZJNq9w==";
        String privateKey3 = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCIwzp3NNXIMwm1kHAjvx5OAhkBZ0tFOHCgfrpNEFOETotnIKq3PzFsijYNGV9iNRoMMBiDRA5iBizvmxzFn6HjccakhpCsRNxd0hZ+1hc5Em3x1FTA/5Z5DZl97EIRH3KTd4RCaHdpcDEzwc1+OdGkvIIknYWH/baiUKhH0wx4to9ovnJb5A7ot3YlCILK3drVJLquZIy4imX4gFpJEXUGU0vmRFQ93cywEFoydvlTmh+iEXSG+fH/Bz78nlNSoqxgfljM0ounmvMh5JTiEyATGaO62fvE4Ud5fxe7N8XlGaXtOQ81eaJ8aUV0rO9Z3F65XqOdt5MsEwHSSZxE6cYfAgMBAAECggEASIdgxj9a8OVATO3gytRcefpa0Ie7P2aDNFqA6sWxxQTyoSqN3sjAqVNS/vdpwmdu/O+00EiTaCDmS9vzEktqS3jXZAGJUBLk20zDaViY0EeZzxpQKFpjrqcrs8BL+VC4LsS/e4hza5N4RH6PQFXhfIAMdOalHk3LQaGM3Spr/sfmzCkdNU1M4QefuVoV/6VmbQqQcuHwyY37UM18HY5kBBTC+X5d/eVxg7PP/HqBT/IXYuTSj/nc2hFueHdttAgfiggQgxeOpgqnfQxh3wDiqvujOcFUKGRIDXWwAIYh149WyUoOP3orbhrfEg6qyPMjjOSRwc1/DYUCpS9d5UedYQKBgQDr7CXOZjHomBS9nIBSTlRjZ42uGH5GHcrwl8buju7eTPtKsWVEd6ouzFHp2ogvbpKrvp8fK2uN4YSk9UCRU2/p9ZmPp6L34mapkgf6LLuz7DpqvBmERDDTDFpvWYL42kj6AesQjq4r4dyk637r29azywfF11p5QmeLcoJH3k8S/QKBgQCUZsPhovJVHSGj0GC24b7HSHW+2ks/ENfCOZ8iKouzFAYTi4pNOywMmfW+CLgXzhUKMvbndNyFBoM3Z1dZM90k+7wFMjUxFqiYHHzFSUg1HeX7lb5Fwdtv9vTFNY4/G9X1IQI4chzYzOJEGuN/Jj0zbkPI1sehp2h2n4VPl/juSwKBgQDb3uulHk0pLoM162MUUfgH5HyAYkdc5Ws7Kti1f/RSrYANLqLoWnX6w2UcAxSkz/JVqYP2sqq8Qg8zBXa1egN1EfWZkmwphZCUPIq+t23/0wrmaoOFZ1/xcTPfTpbngdg9WAhRGAhu0UKnWOqiufGxAmkuEvQ4ypBhv8h3XlJnqQKBgFq1kggKrOufud9C0MsYo592SBqXniT3a5qZ1A5zSR72H1y1D51zjNJLDW3SMIzEeBHa4xbJVL2vJGeqMDcjP4qKoPvgG6lcu0L3LsD8sTlehCRK/JnxC+udXTJqMP+cSSTjv1K3VbCjU67jbKlcu04DmUVbG31RMcZIbZkgQJWPAoGAUlgvoP6QZO4Vj6Q8d+7U+OKVdn8oiYvBwb0DbJFAzfeA7YDdCv+IElF17lkYcBZdfvEThx1sEeXQKg/a0aaumWcP0i5Xp7tqSe58+QLyj8NQN7swkf37n9X76J1fDA1fkGuptBW1Lo6ss2LzXKS5XclTWh5nlqRsRj0ja7yBdz4=";
        String privateKey4 = "MIICXgIBAAKBgQCsl4w26KzD3S7XHH2QyErbOJHkwLLxuDqMK9PgFfJH8Bv2B5jWchubxVStXVAPyIpVweld1oORu3SRAvB3bgAZdVYvraSg0Dtq7VJ3edsQEBMX7zfz2ClYsbKCPIJnxYf3+w5fLYQ6nq0+SJQLgivLyRb3wHQXaZe2WLxCR8/AXwIDAQABAoGBAI/Oyp8p6mJdFt1YOOv9aBoXncC8K54rQmVvU2CBCNqWH8Y1eE0e0RBPMQovGTm9gD6Kj3eH+SLhzfPSPilVN7CfEuUkAIMPo2XY5V1O6dQHmcpb4Us6AnxLI15aXvm+agkc+9la8GBjzEUmIC7bboJrbPMWakaQDPc1j0SM/+TBAkEA5hD/hVjwC/5eGZu/e6gc9Zol9LLLc7znEWAOENY+FtYHxjvyNCLGdkcUM17TcPSCkjj5UsxwDrjeYk/8O+lUYQJBAMAMBDPqDWRodFU76Obq5QhXBdHnkZX7deiAM71FsOcKrQIA9llQOUBw4t1rKhbdA4NGnoTFGqfm5X1k6H7NTL8CQHGxpsS8Pex/aPtYx5kRbDZHVkiF7xskGECy6mCRr59TaAYj676uDMu4tpfoXa9tdfVS6IttclckLuoAwxLMbSECQQCdOnlKY2mZdecgTQ8t1suyG0T5h+PqbdgnhKZXZDIjxdrE1DLcBlEJECK8clsgIswYcv2e55weMGxcT/wErGITAkEAhda4+Ab/YSO9NWxDAfoT+yDhtKhANRS9Gtnf/XSA81JJsRhr9dl3iqHwf9GRTbdGwMMvDsxag/+UivApZLplcw==";
        String signType = "RSA2";
        String content1 = "listOfCampaign=[{\"campaignName\":\"cxj12313212\",\"campaignCode\":\"021\",\"type\":\"CMS_Assign Benefit\",\"startDate\":\"10/16/2019\",\"endDate\":\"11/15/2019\",\"listOfStores\":[{\"storeId\":\"123456\"}],\"listOfBenefits\":[{\"benefitEndDate\":\"11/16/2019\",\"benefitId\":\"cxj123132\",\"benefitNum\":\"100\",\"benefitStartDate\":\"2019-10-16\",\"dateRange\":\"01/10/2019~01/20/2019\",\"daysRange\":\"10~20\",\"storeLimit\":\"Y\",\"timeRange\":\"00:00~23:00\",\"weekDaysRange\":\"1~5\"}]}]&sourceCode=CMS";
        String content2 = "listOfCampaign=[{\"listOfBenefits\":[{\"benefitNum\":\"1\",\"dateRange\":\"01/10/2019~01/20/2019\",\"storeLimit\":\"Y\",\"weekDaysRange\":\"1~5\",\"benefitEndDate\":\"01/17/2019\",\"benefitStartDate\":\"01/17/2019\",\"daysRange\":\"10~20\",\"benefitId\":\"cxj1231\",\"timeRange\":\"00:00~23:00\"}],\"endDate\":\"01/17/2019\",\"listOfStores\":[{\"storeId\":\"123456\"}],\"type\":\"CMS_Assign Benefit\",\"campaignName\":\"cxj1231\",\"startDate\":\"01/17/2019\",\"campaignCode\":\"cxj1231\"}]&sourceCode=CMS";

        Map<String, String> requestParam = new HashMap<>();
        requestParam.put("sourceCode", "CMS");
        Map<String, Object> campaign = new HashMap<>();
        campaign.put("campaignCode","cxj1231");
        campaign.put("campaignName","cxj1231");
        campaign.put("endDate","01/17/2019");
        campaign.put("startDate","01/17/2019");
        campaign.put("type","CMS_Assign Benefit");

        Map<String, Object> benefit = new HashMap<>();
        benefit.put("benefitEndDate","01/17/2019");
        benefit.put("benefitId","cxj1231");
        benefit.put("benefitNum","1");
        benefit.put("benefitStartDate","01/17/2019");
        benefit.put("storeLimit","Y");
        benefit.put("dateRange","01/10/2019~01/20/2019");
        benefit.put("daysRange","10~20");
        benefit.put("timeRange","00:00~23:00");
        benefit.put("weekDaysRange","1~5");
        List<Object> listBenefits=new ArrayList<>();
        listBenefits.add(benefit);
        campaign.put("listOfBenefits",listBenefits);
        Map<String, Object> store = new HashMap<>();
        store.put("storeId","123456");
        List<Object> listStores=new ArrayList<>();
        listStores.add(store);
        campaign.put("listOfStores",listStores);
        List<Object> listCampaigns=new ArrayList<>();
        listCampaigns.add(campaign);
        String list= JSON.toJSONString(listCampaigns);
        requestParam.put("listOfCampaign", list);

        StringBuilder sb = new StringBuilder();
        requestParam.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).forEach(entry -> sb.append(entry.getKey()).append("=").append(entry.getValue()).append("&")) ;
        if (sb.lastIndexOf("&") != -1) {
            sb.deleteCharAt(sb.length() - 1);
        }
        System.out.println(sb.toString());
        String content = sb.toString();
        String content3 = "listOfCampaign=[{\"campaignName\":\"cxj12313212\",\"campaignCode\":\"021\",\"type\":\"CMS_Assign Benefit\",\"startDate\":\"10/16/2019\",\"endDate\":\"11/15/2019\",\"listOfStores\":[{\"storeId\":\"123456\"}],\"listOfBenefits\":[{\"benefitEndDate\":\"11/16/2019\",\"benefitId\":\"cxj123132\",\"benefitNum\":\"100\",\"benefitStartDate\":\"2019-10-16\",\"dateRange\":\"01/10/2019~01/20/2019\",\"daysRange\":\"10~20\",\"storeLimit\":\"Y\",\"timeRange\":\"00:00~23:00\",\"weekDaysRange\":\"1~5\"}]}]&sourceCode=CMS";
        String content4 = "listOfCampaign=[{\"listOfBenefits\":[{\"benefitNum\":\"100\",\"dateRange\":\"01/10/2019~01/20/2019\",\"storeLimit\":\"Y\",\"weekDaysRange\":\"1~5\",\"benefitEndDate\":\"11/16/2019\",\"benefitStartDate\":\"2019-10-16\",\"daysRange\":\"10~20\",\"benefitId\":\"cxj123132\",\"timeRange\":\"00:00~23:00\"}],\"endDate\":\"11/15/2019\",\"listOfStores\":[{\"storeId\":\"123456\"}],\"type\":\"CMS_Assign Benefit\",\"campaignName\":\"cxj12313212\",\"startDate\":\"10/16/2019\",\"campaignCode\":\"021\"}]&sourceCode=CMS";
        String content5 = "listOfCampaign=[{\"listOfBenefits\":[{\"benefitNum\":\"100\",\"dateRange\":\"01/10/2019~01/20/2019\",\"storeLimit\":\"N\",\"weekDaysRange\":\"1~5\",\"benefitEndDate\":\"01/17/2019\",\"benefitStartDate\":\"01/17/2019\",\"daysRange\":\"10~20\",\"benefitId\":\"cxj123132\",\"timeRange\":\"00:00~23:00\"}],\"endDate\":\"01/17/2019\",\"listOfStores\":[{\"storeId\":\"123456\"}],\"type\":\"CMS_Assign Benefit\",\"campaignName\":\"cxj12313212\",\"startDate\":\"01/17/2019\",\"campaignCode\":\"cx222\"}]&sourceCode=CMS";
        String content6 = "{\"campaignId\":\"1-FJV26M7\",\"filename\":\"mass-benefit-43.csv\",\"traceId\":\"CMS2019111453\",\"type\":\"CMS_Assign Benefit\",\"total\":10,\"success\":10}";
        try {
            String sign = RSAUtils.sign(content6,privateKey2,signType,"UTF-8");
            System.out.println(sign);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
