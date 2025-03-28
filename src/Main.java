public class Main {
    public static void main(String[] args) {
        // 학생의 시험 점수들 (정수형) - 소수점 결과가 나오도록 수정
        int korean = 85;
        int english = 92;
        int math = 76;
        int totalSubjects = 3;

        // 방법 1: 형변환 없이 평균 계산 (정수 나눗셈)
        int sum = korean + english + math;
        int averageWithoutCasting = sum / totalSubjects;

        System.out.println("형변환 없는 평균: " + averageWithoutCasting);


        // 방법 2: 형변환을 사용한 평균 계산 (실수 나눗셈)
        double averageWithCasting = (double) sum / totalSubjects;
        System.out.println("형변환 사용 평균: " + averageWithCasting);

        // 소수점 두 자리로 반올림하여 표시
        System.out.printf("형변환 사용 평균(반올림): %.2f\n", averageWithCasting);
    }
}