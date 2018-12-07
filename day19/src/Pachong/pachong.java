package Pachong;
import java.io.*;

import java.net.HttpURLConnection;

import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class pachong {
    public static void main(String[] args) throws IOException {
        HttpURLConnection url = (HttpURLConnection)new URL("https://tieba.baidu.com/p/2256306796?red_tag=1781367364").openConnection();
        InputStream in = url.getInputStream();
        BufferedReader Reader = new BufferedReader(new InputStreamReader(in, "utf-8"));
        StringBuilder Builder = new StringBuilder(1024 * 1024);
        while(true){
            String  len=Reader.readLine();
            if(len==null){
                break;
            }
            Builder.append(len);
        }
        String s=Builder.toString();


        Pattern com = Pattern.compile("<img class=\"BDE_Image\" src=\"(.*?)\"");
        Matcher mat = com.matcher(s);


        while(mat.find()){
            String str=mat.group();
            System.out.println(str);


            String sub= str.substring(str.indexOf("https"),str.lastIndexOf("\"") );
            System.out.println(sub);
            URLConnection conn = new URL(sub).openConnection();
            InputStream in2 = conn.getInputStream();
            String path="E:\\tupian\\";
            String zPath=path+str.substring(str.lastIndexOf("/")+1,str.lastIndexOf("\"") );
            System.out.println(zPath.toString());
            FileOutputStream out = new FileOutputStream(zPath);
            while (true) {
                byte[] buf = new byte[1024 * 1024];
                int len = in2.read(buf);
                if (len == -1) {
                    break;
                }
                out.write(buf, 0, len);
                out.flush();
            }

        }

    }

}


