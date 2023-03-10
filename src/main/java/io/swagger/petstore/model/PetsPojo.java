package io.swagger.petstore.model;

import java.util.ArrayList;
import java.util.HashMap;

public class PetsPojo {
    private long petId;
    private HashMap<String,Object> category;
    private String name;
    private ArrayList<String> photoUrls;
    private ArrayList<HashMap<String,Object>> tags;
    private String status;

    public long getId() {
        return petId;
    }

    public void setId(long petId) {
        this.petId = petId;
    }

    public HashMap<String, Object> getCategory() {
        return category;
    }

    public void setCategory(HashMap<String, Object> category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(ArrayList<String> photoUrls) {
        this.photoUrls = photoUrls;
    }

    public ArrayList<HashMap<String, Object>> getTags() {
        return tags;
    }

    public void setTags(ArrayList<HashMap<String, Object>> tags) {
        this.tags = tags;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static PetsPojo createPetsPojo(long petId, HashMap<String,Object> category, String name, ArrayList<String> photoUrls, ArrayList<HashMap<String,Object>> tags, String status){
        PetsPojo petsPojo = new PetsPojo();
        petsPojo.setCategory(category);
        petsPojo.setName(name);
        petsPojo.setPhotoUrls(photoUrls);
        petsPojo.setTags(tags);
        petsPojo.setStatus(status);
        return petsPojo;
    }
}
