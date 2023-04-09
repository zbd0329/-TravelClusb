package sangsok.step01;

public class GraphicEditor {

    private static final int ARRAY_LENTH = 5;

    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[ARRAY_LENTH];
        Ellipse[] ellipses = new Ellipse[ARRAY_LENTH];
        Line[] lines = new Line[ARRAY_LENTH];

        //Generate Shapes 도형 생성
        for(int i = 0; i <ARRAY_LENTH ; i++){
            int randomNumber = (int)(Math.random() * 3);
            if(randomNumber == 0){
                rectangles[i] = new Rectangle();
            }else if(randomNumber == 1){
                ellipses[i] = new Ellipse();
            }else{
                lines[i] = new Line();
            }
        }
        //Drwing Sapes 그림 그리기
        for(int i = 0; i < ARRAY_LENTH ; i++){
            if(rectangles[i] != null){
                rectangles[i].drawRectangle();;
            } else if(ellipses[i] != null){
                ellipses[i].drawEllipse();
            } else{
                lines[i].drwqLine();
            }
        }



    }

}
