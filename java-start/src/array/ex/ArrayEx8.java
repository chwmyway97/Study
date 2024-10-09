package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //학생수 입력
        System.out.print("학생수를 입력하세요:");
        int students = scanner.nextInt();

        //각 과목명에 해당하는 문자열 배열
        String[] subjects = {"국어", "영어", "수학"};

        //4명의 학생, 각 학생당 3개의 성적을 저장할 배열
        int[][] scores = new int[students][subjects.length];

        //학생별 성적 입력
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "번의 학생의 성적을 입력하세요:");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(subjects[j] + " 점수:");
                scores[i][j] = scanner.nextInt();
            }
        }

        // 학생별 총점 및 평균 계산 후 출력
        for (int i = 0; i < scores.length; i++) {
            int total = 0;
            double average = 0;

            // 각 학생의 성적을 합산
            for (int j = 0; j < scores[i].length; j++) {
                total += scores[i][j];
            }

            //평균 계산
            average = (double) total / scores[i].length;

            // 총점 및 평균 출력
            System.out.println((i + 1) + "번 학생의 총점: " + total + ", 평균: " + average);


        }


    }
}
