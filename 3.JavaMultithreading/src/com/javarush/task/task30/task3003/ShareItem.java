package com.javarush.task.task30.task3003;

import java.util.Objects;

//This class shows how to call other constructors using 'this'
public class ShareItem {

    public String description;
    public int itemId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShareItem)) return false;
        ShareItem shareItem = (ShareItem) o;
        return getItemId() == shareItem.getItemId() &&
                Objects.equals(getDescription(), shareItem.getDescription());
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescription(), getItemId());
    }

    public ShareItem() {
        this("Test Item", 0);
    }

    public ShareItem(String description) {
        this(description, 0);
    }

    public ShareItem(int itemId) {
        this("Test Item", itemId);
    }

    public ShareItem(String description, int itemId) {
        this.description = description;
        this.itemId = itemId;
    }

    public String getDescription() {
        return description;
    }

    public int getItemId() {
        return itemId;
    }
}