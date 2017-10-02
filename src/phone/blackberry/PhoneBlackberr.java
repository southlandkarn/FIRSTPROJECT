package phone.blackberry;

/**
 * Created by User on 9/21/2017.
 */
public class PhoneBlackberr {
    private String type;
    private String color;
    private String model;

    public int getPrice() {
        if (color == "green") {
            return 100;
        } else {
            return 60;
        }
    }

    public void call(final String tone) {
        System.out.println(tone);
    }

        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }

        public String getModel() {
            return model;
        }
        public void setModel(String model) {
            this.model = model;
        }
    }

