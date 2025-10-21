public class Lab1 {
    public static char[][]make_forward(){
        char[][] pixel = new char[4][13];
        pixel[0] = new char[]{' ', ' ', '_', '_', '_', '_', '_', '_', ' ', ' ', ' ', ' ', ' '};
        pixel[1] = new char[]{' ', '/', '|', '_', '|', '|', '_', '\\', '\'', '.', '_', '_', ' '};
        pixel[2] = new char[]{'(', ' ', ' ', ' ', '_', ' ', ' ', ' ', ' ', '_', ' ', '_', '\\'};
        pixel[3] = new char[]{'=', '\'', '-', '(', '_', ')', '-', '-', '(', '_', ')', '-', '\''};
        return pixel;
    }
    public static char[][]make_mirror(){
        char[][] pixel = new char[4][13];
        pixel[0] = new char[]{' ', ' ', ' ', ' ', ' ', '_', '_', '_', '_', '_', '_', ' ', ' '};
        pixel[1] = new char[]{' ', '_', '_', '.', '\'', '/', '_', '|', '|', '_', '|', '\\', ' '};
        pixel[2] = new char[]{'/', '_', ' ', '_', ' ', ' ', ' ', ' ', ' ', '_', ' ', ' ', ')'};
        pixel[3] = new char[]{'\'', '-', '(', '_', ')', '-', '-', '(', '_', ')', '-', '\'', '='};
        return pixel;
    }
    public static void main(String args[]){
        //making forward
        char[][] carPixel= new char[4][13];
        carPixel=make_forward();
        for (int firstPixel=0;firstPixel<4;firstPixel++){
            for(int secondPixel=0;secondPixel<13;secondPixel++){
                System.out.print(carPixel[firstPixel][secondPixel]);
            }
            System.out.println();
        }
        //making mirrored
        char[][] mirrorCar= new char[4][13];
        mirrorCar=make_mirror();
        for (int row=0;row<4;row++){
            for(int col=0;col<13;col++){
                System.out.print(mirrorCar[row][col]);
            }
            System.out.println();
        }
        //making collision
        for (int firstPixel=0;firstPixel<4;firstPixel++){
            System.out.print(carPixel[firstPixel]);
            System.out.print(mirrorCar[firstPixel]);
            System.out.println();
        }
    }
}
