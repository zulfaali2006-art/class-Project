package Project;

public class SimpleMap {
    private String[] keys = new String[10];
    private TravelCompany[] values = new TravelCompany[10];
    private int size = 0;

    public void put(String key, TravelCompany value) {
        keys[size] = key;
        values[size] = value;
        size++;
    }

    public TravelCompany get(String key) {
        for (int i = 0; i < size; i++) {
            if (keys[i].equals(key)) {
                return values[i];
            }
        }
        return null;
    }
}
