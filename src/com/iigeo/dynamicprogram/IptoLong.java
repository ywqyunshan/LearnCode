package com.iigeo.dynamicprogram;

/**
 * Convert an IPv4 address in the format of null-terminated C string into a 32-bit integer
 */
public class IptoLong {

    /**
     * ipv4地址转换32位整形
     * @param ip
     * @return
     */
    public long iptoLong(String ip){
        if (!isIPv4(ip)) return 0;
        //根据.切割字符串
        String[] ipAddress=ip.split("\\.");
        long result=0;
        for (int i=3;i>=0;i--){
            long iplong=Long.parseLong(ipAddress[3-i]);
            //每个数值做对应位运算
            // 1. 192 << 24
            // 1. 168 << 16
            // 1. 1 << 8
            // 1. 2 << 0
            result |= iplong << (i * 8);
        }
        return result;
    }

    /**
     * 验证是否是IPv4地址
     * @param ip
     * @return
     */
    private boolean isIPv4(String ip){
        if (ip==null||ip.length()<=0)return false;
        //最后一位不能为.
        if (ip.charAt(ip.length() - 1) == '.') {
            return false;
        }
        String[] nums = ip.split("\\.");
        if (nums.length != 4) {
            return false;
        }
        for (String val : nums) {
            // 注意：192.0.0.1这种情况。当子串length>1，这是就不能以0开头。
            if ("".equals(val) || val.length() > 3 || (val.length() > 1 && val.charAt(0) == '0')) {
                return false;
            }
            for (int i = 0; i < val.length(); i++) {
                if (!(val.charAt(i) >= '0' && val.charAt(i) <= '9')) {
                    return false;
                }
            }
            if (Integer.parseInt(val) > 255) {
                return false;
            }
        }
        return true;
    }
}
