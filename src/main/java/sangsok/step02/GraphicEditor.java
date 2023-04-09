package sangsok.step02;

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
        //for each 구문 (배열을 구성하고 있는 타입 : 배열) 향상된 포문
        for(Shape shape: shapes){
            //다운 캐스팅이 되는지 확인
            //draw메서드를 호출하기 위해서는 다운캐스팅을 해야한다. (부모가 가진만큼밖에 없음)
            if(shape instanceof Rectangle){
//                Rectangle rectangle = (Rectangle) shape;
//                rectangle.drawRectangle();
                //위의 두줄을 하나로 합쳐 놓은 것. 필요 없는 변수 선언을 하지 않기 위해
                ((Rectangle)shape).drawRectangle();

            } else if (shape instanceof Ellipse) {
                ((Ellipse)shape).drawEllipse();

            } else if (shape instanceof Line) {
                ((Line)shape).drwqLine();

            }
        }



    }

}
