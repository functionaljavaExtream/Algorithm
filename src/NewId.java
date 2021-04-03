
public class NewId {
    public String solution(String id) {
        String answer = "";
        id = id.toLowerCase();
        id = id.replaceAll("[^a-z0-9-_.]", "");
        id = id.replaceAll("\\.{2,}",".");

        if(id.startsWith(".")) {
            id = id.substring(1);
        }
        if(id.endsWith(".")) {
            id = id.substring(0, id.length()-1);
        }

        if(id.isEmpty()) {
            id = "a";
        }

        if(id.length() >= 16) {
            id = id.substring(0, id.length()-1);
            if(id.endsWith("."))  {
                id = id.substring(0, id.length()-1);
            }
        }

        if(id.length() <= 2) {
            while (id.length() < 3) {
                id = id + id.charAt(id.length());
            }
        }
        answer = id;

        return answer;
    }
}
