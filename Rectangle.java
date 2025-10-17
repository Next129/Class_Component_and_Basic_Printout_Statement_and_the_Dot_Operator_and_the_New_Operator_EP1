public class Rectangle {

int width;
int length;

Rectangle()
{
	width = 1;
	length = 1;
	}
Rectangle(int x,int y) {
	width = x;
	length = y;
	
}
double findArea() {
    return width * length;
 }
double findPerimeter() {
	return (width+length)*2;
}
double findDiagonal() {
	return Math.sqrt(Math.pow(width,2)+Math.pow(length,2));
}
boolean isSquare() {
	if (width == length) {
		return true;
		}
	else {
		return false;
		
	}
	}
void printBasicInfo() {
	System.out.println("The width is "+width);
	System.out.println("The length is "+length);
	
}
		
	
	
}




