package com.nitincodes;

public class Main {

    public static void main(String[] args) {
	String name = "nitin";
	char target = 'z';
        System.out.println(searchhh(name,target));
    }
    static boolean searchhh(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;

    }
}
