package Hash;

public class Hash_Linear {
    private String[] hash_field;
    private int number_fields;
    private final int hash_const = 999991;

    public Hash_Linear(int number_fields) {
        hash_field = new String[number_fields];
        this.number_fields = number_fields;

        for (int i = 0; i < number_fields; i++) {
            hash_field[i] = null;
        }
    }

    public void add(String value) {
        if (is_not_full() == 0) {
            System.out.println("Hash table is full");
        }

        int ind = hash_func(value);

        while (true) {
            if (hash_field[ind] == null) {
                hash_field[ind] = value;
                return;
            } else {
                if (ind < number_fields-1) {
                    ind++;
                } else {
                    ind = 0;
                }
            }
        }
    }

    public int search(String value) {
        int ind = hash_func(value);
        
        int count = 0;
        while (true) {
            if (count != number_fields) {
                if (hash_field[ind] == value) {
                    return ind;
                } else {
                    if (ind < number_fields-1) {
                        ind++;
                    } else {
                        ind = 0;
                    }
                }
            } else {
                return -1;
            }
        }
    }

    public int is_not_full() {
        int count = 0;
        for (int i = 0; i < hash_field.length; i++) {
            if (hash_field[i] == null) {
                count++;
            }
        }
        return count;
    }

    private int hash_func(String value) {
        char ascii = value.charAt(value.length()-1);
        int temp = (int)ascii * hash_const;
        return temp % number_fields;
    }
}
