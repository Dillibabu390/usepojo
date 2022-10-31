package JavaBasic;

import java.util.ArrayList;

public class Users {
    private String name;
    private Integer id;
    private String url;

    private ArrayList<String> urls;

    public Users(String name, Integer id, String url, ArrayList<String> urls) {
        this.name = name;
        this.id = id;
        this.url = url;
        this.urls = urls;
    }

    public Users() {

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ArrayList<String> getUrls() {
        return urls;
    }

    public void setUrls(ArrayList<String> urls) {
        this.urls = urls;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", url='" + url + '\'' +
                ", urls=" + urls +
                '}';
    }
}
