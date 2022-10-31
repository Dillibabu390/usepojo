package JavaBasic;

import java.util.ArrayList;
import java.util.List;

public class model {

    public static void main(String[] args) {

        String url1 ="oneurl";
        String url2 = "twourl";
        String url3 ="threeurl";

        List<String> allurls = new ArrayList<>();
        allurls.add(url1);
        allurls.add(url2);
        allurls.add(url3);

        List<Users> user = new ArrayList<>();

        user.add(new Users("sfgs",1,"sdfggs", (ArrayList<String>) allurls));

        System.out.println(user);

        /*List<String> allurls = new ArrayList<>();
        allurls.add(url1);
        allurls.add(url2);
        allurls.add(url3);

        Users users = new Users();
        users.setName("dillibabu");
        users.setId(1);
        users.setUrls((ArrayList<String>) allurls);
        users.setUrl("urll");

        System.out.println(users.getId());
        System.out.println(users.getName());
        System.out.println(users.getUrl());

        String s = String.valueOf(users.getUrls().size());
        System.out.println(s);
        System.out.println(users.getUrls());*/

    }
}
