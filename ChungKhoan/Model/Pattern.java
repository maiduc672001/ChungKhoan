package ChungKhoan.Model;

public enum  Pattern {
/*
* 1:String
* 2:Scale
* 3:Date
* 4:Number
*
* */
PATTERN_1("Nhưng riêng mua chứng chỉ quỹ ' ' của Quỹ đầu tư cân bằng ' ' thì có thể nói là “mua tiền” với giá rẻ gần một nửa, vì cổ phiếu chỉ chiếm ' ' của Quỹ; tiền mặt chiếm ' ' và trái phiếu chiếm ' ' của ' ' vào thời điểm ' ', trong đó trái phiếu chính phủ chiếm ' ' và trái phiếu doanh nghiệp chiếm ' '.", new int[]{1,1,2,2,2,1,3,2,2});
Pattern(String pattern,int[] arr){
this.pattern=pattern;
this.arr=arr;
}
    private String pattern;
    private int[] arr;

    public String getPattern() {
        return pattern;
    }

    public int[] getArr() {
        return arr;
    }
}
