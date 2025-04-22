public class APLine
{
  private int a, b, c;
  public APLine(int aVal, int bVal, int cVal) {
    a = aVal;
    b = bVal;
    c = cVal;
  } 
  public double getSlope() {
    return -1*(double)(a/b);
  }  
  public boolean isOnLine(int x, int y) {
    if(a * x + b * y + c == 0) {
      return true;
    } else {
      return false;
    }  
  }  
}
