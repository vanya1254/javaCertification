package program.model;

import com.google.gson.Gson;
import program.model.shop.Shop;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
//    private Gson gson;
//    private Shop shop;
//    public FileManager() {
//        this.gson = new Gson();
//        try (FileReader reader = new FileReader("src\\program\\model\\store.json")){
//            this.shop = this.gson.fromJson(reader, Shop.class);
//            return this.shop;
//        } catch (Exception e){}
//    }

    public Shop readJson(){
        Gson gson = new Gson();
        try (FileReader reader = new FileReader("src\\program\\model\\store.json")){
            Shop shop = gson.fromJson(reader, Shop.class);
            return shop;
        } catch (Exception e){}

        return null;
    }

    public void writeJson(Shop shop){
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter("src\\program\\model\\store.json")){
            writer.write(gson.toJson(shop));
        } catch (Exception e) {}
    }
}
