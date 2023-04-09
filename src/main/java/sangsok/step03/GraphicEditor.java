package sangsok.step03;

public class GraphicEditor {

    private static final int ARRAY_LENTH = 5;

    public static void main(String[] args) {
//        Rectangle[] rectangles = new Rectangle[ARRAY_LENTH];
//        Ellipse[] ellipses = new Ellipse[ARRAY_LENTH];
//        Line[] lines = new Line[ARRAY_LENTH];

        //상속을 통해 하나의 배열로 관리할 수 있다.
        //자식은 부모의 모습을 할 수 있다.
        Shape[] shapes = new Shape[ARRAY_LENTH];


        //Generate Shapes 도형 생성
        for(int i = 0; i <ARRAY_LENTH ; i++){
            int randomNumber = (int)(Math.random() * 3);
            if(randomNumber == 0){
                shapes[i] = new Rectangle();
            }else if(randomNumber == 1){
                shapes[i] = new Ellipse();
            }else{
                shapes[i] = new Line();
            }
        }
        //Drwing Sapes 그림 그리기
        //다형성을 이용하여 코드가 줄어듦
        for(Shape shape: shapes){
            shape.draw();
        }



    }

}
