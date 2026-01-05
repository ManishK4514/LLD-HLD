package structural_design_patterns.composite.src;

import java.util.ArrayList;
import java.util.List;


public class Folder implements FileSystemItem {
    private final String name;
    private final List<FileSystemItem> items;

    public Folder (String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    public void addItem(FileSystemItem item) {
        items.add(item);
    }

    public void removeItem(FileSystemItem item) {
        items.remove(item);
    }

    @Override
    public void showDetails() {
        System.out.println("Folder: " + name);
        for (FileSystemItem item : items) {
            item.showDetails();
        }
    }

}
