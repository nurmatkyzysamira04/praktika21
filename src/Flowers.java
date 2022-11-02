public class Flowers {
    String name;
    int price;
    String color;

    public void maxPrice(Flowers[] array) {
        int maxPrice = array[0].price;
        for (int i = 0; i < array.length; i++) {
            if (maxPrice <= array[i].price) {
                maxPrice = array[i].price;

            }

        }
        System.out.println("maxPrice = " + maxPrice);

    }


    public  void separete(Flowers[] array){
        int rozcount=0;
        int tylcount=0;
        for (Flowers flowers:array) {
            if (flowers.name.equals("roza")){
                rozcount++;

            }else{
                tylcount++;
            }

        }
        Flowers[] massivroz=new Flowers[rozcount];
        Flowers[] massivtyl=new Flowers[tylcount];
        for (int i = 0,j=0,k=0; i <array.length ; i++) {
            if (array[i].name.equals("roza")){
               massivroz[j]=array[i];
               j++;
            }else {
                massivtyl[k]=array[i];
                k++;
            }
        }
        for (Flowers flowers:massivroz) {
            System.out.println("flowers.name = " + flowers.name);
            System.out.println("flowers.price = " + flowers.price);
            System.out.println("flowers.color = " + flowers.color);
        }
        System.out.println("-------------------------------------------------------");
        for (Flowers flowers:massivtyl) {
            System.out.println("flowers.name = " + flowers.name);
            System.out.println("flowers.price = " + flowers.price);
            System.out.println("flowers.color = " + flowers.color);

        }

        }
    }

