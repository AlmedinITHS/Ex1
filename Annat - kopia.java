public class Annat {
  public static void main (String [] args) {
    bark(true);
    bark();

    }

    public static void bark (boolean upset) {
      if(upset) {
        System.out.println("Bark but angry");
        }
        else {
        System.out.println("bark");
        }
      }
      public static void bark() {
        bark(false);
      }
    }
