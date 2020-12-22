package study;

public class BizExam {
    public static void main(String[] args) {
        BizService biz = new BizService();
        try {
            biz.bizMethod(5);
            biz.bizMethod(-1);
        } catch (BizException e) {
            e.printStackTrace();
        }
    }
}
