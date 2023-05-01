package program.model;

import com.google.gson.Gson;
import program.model.shop.Shop;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    private final static String PATH = "src\\program\\model\\store.json";
    private final static String EXCEPTION_NOT_FOUND = "The file 'store.json' was not found.\nA new has been created.\n";

    public Shop readJson(){
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(PATH)){
            Shop shop = gson.fromJson(reader, Shop.class);
            return shop;
        } catch (Exception e){
            System.out.println(EXCEPTION_NOT_FOUND);
            try (FileWriter writer = new FileWriter(PATH)){
                Shop excShop = new Shop();
                writer.write(gson.toJson(excShop));
                return excShop;
            } catch (Exception f) {}
        }

        return null;
    }

    public void writeJson(Shop shop){
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(PATH)){
            writer.write(gson.toJson(shop));
        } catch (Exception e) {}
    }
}
