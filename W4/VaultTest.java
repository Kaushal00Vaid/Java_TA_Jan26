package W4;

import java.util.*;

// Define VaultItem abstract class
abstract class VaultItem {
    abstract void saveItem();

    abstract void validateLink();
}

// Define RepoLink class
class RepoLink extends VaultItem {
    private String url;

    public RepoLink(String str) {
        this.url = str;
    }

    public void saveItem() {
        System.out.println("Saving repository link...");
        validateLink();
    }

    public void validateLink() {
        if (this.url.startsWith("https://github.com")) {
            System.out.println("Valid open-source repo.");
        } else {
            System.out.println("Invalid repository URL.");
        }
    }
}

// Define DocLink class
class DocLink extends VaultItem {
    private String url;

    public DocLink(String str) {
        this.url = str;
    }

    public void saveItem() {
        System.out.println("Saving repository link...");
        validateLink();
    }

    public void validateLink() {
        if (this.url.startsWith("https://github.com")) {
            System.out.println("Valid open-source repo.");
        } else {
            System.out.println("Invalid repository URL.");
        }
    }
}

public class VaultTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String repoUrl = sc.next();
        String docUrl = sc.next();

        VaultItem rItem = new RepoLink(repoUrl);
        VaultItem dItem = new DocLink(docUrl);

        rItem.saveItem();
        dItem.saveItem();
    }
}
