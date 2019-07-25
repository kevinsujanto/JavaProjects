import java.util.*;

public class tester
{
    public static void syllabusCategories()
    {
        System.out.println("Syllabus Categories: ");
        System.out.println("1. Homework");
        System.out.println("2. Labs");
        System.out.println("3. Quiz");
        System.out.println("4. Midterm 1");
        System.out.println("5. Midterm 2");
        System.out.println("6. Midterm 3");
        System.out.println("7. Final Exam");
        System.out.println("8. Project");
        System.out.println("9. Participation");
        System.out.println("0. Other Categories");
    }

    public static void syllabusPrinter(String name, String semester)
    {
        // SYLLABUS CATEGORIES
        syllabusCategories();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number(s) that corresponds to your syllabus without spaces: ");
        String str_categories = sc.nextLine();
        int[] categories = new int[str_categories.length()];
        for(int i = 0; i < str_categories.length(); i++)
        {
            categories[i] = Integer.parseInt(str_categories.substring(i, i + 1));
        }
        Arrays.sort(categories);

        // Variables
        // Num
        int homework_num = 0;
        int lab_num = 0;
        int quiz_num = 0;
        int project_num = 0;

        // Percent
        double homework_percent = 0;
        double lab_percent = 0;
        double quiz_percent = 0;
        double midterm1_percent = 0;
        double midterm2_percent = 0;
        double midterm3_percent = 0;
        double final_percent = 0;
        double project_percent = 0;
        double participation_percent = 0;

        // Grade
        double[] homework_grade = {0};
        double[] lab_grade = {0};
        double[] quiz_grade = {0};
        double midterm1_grade = 0;
        double midterm2_grade = 0;
        double midterm3_grade = 0;
        double final_grade = 0;
        double[] project_grade = {0};
        double participation_grade = 0;

        // LOOPING THROUGH CATEGORIES
        for(int j = 0; j < categories.length; j++)
        {
            int category_num = categories[j];
            switch (category_num)
            {
                case 1:
                    System.out.print("Enter how many homework you have in total: ");
                    homework_num = sc.nextInt();
                    System.out.print("Enter how many percent your homework is worth in total: ");
                    homework_percent = sc.nextDouble();
                    break;
                case 2:
                    System.out.print("Enter how many labs you have in total: ");
                    lab_num = sc.nextInt();
                    System.out.print("Enter how many percent your lab is worth in total: ");
                    lab_percent = sc.nextDouble();
                    break;
                case 3:
                    System.out.print("Enter how many quizzes you have in total: ");
                    quiz_num = sc.nextInt();
                    System.out.print("Enter how many percent your quiz is worth in total: ");
                    quiz_percent = sc.nextDouble();
                    break;
                case 4:
                    System.out.print("Enter how many percent your first midterm is worth: ");
                    midterm1_percent = sc.nextDouble();
                    break;
                case 5:
                    System.out.print("Enter how many percent your second midterm is worth: ");
                    midterm2_percent = sc.nextDouble();
                    break;
                case 6:
                    System.out.print("Enter how many percent your third midterm is worth: ");
                    midterm3_percent = sc.nextDouble();
                    break;
                case 7:
                    System.out.print("Enter how many percent your final exam is worth: ");
                    final_percent = sc.nextDouble();
                    break;
                case 8:
                    System.out.print("Enter how many projects you have in total: ");
                    project_num = sc.nextInt();
                    System.out.print("Enter how many percent your project is worth in total: ");
                    project_percent = sc.nextDouble();
                    break;
                case 9:
                    System.out.print("Enter how many percent your participation is worth in total: ");
                    participation_percent = sc.nextDouble();
                    break;
                case 0:
                    break;
            }
        }
        System.out.println("---------------------");
        System.out.println("You currently have: ");
        if (homework_num > 0)
            System.out.println("- " + homework_num + " homework(s) that's worth " + homework_percent + "%");
        if (lab_num > 0)
            System.out.println("- " + lab_num + " lab(s) that's worth " + lab_percent + "%");
        if (quiz_num > 0)
            System.out.println("- " + quiz_num + " quiz(zes) that's worth " + quiz_percent + "%");
        if (midterm1_percent > 0)
            System.out.println("- " + "Midterm 1 that's worth " + midterm1_percent + "%");
        if (midterm2_percent > 0)
            System.out.println("- " + "Midterm 2 that's worth " + midterm2_percent + "%");
        if (midterm3_percent > 0)
            System.out.println("- " + "Midterm 3 that's worth " + midterm3_percent + "%");
        if (final_percent > 0)
            System.out.println("- " + "Final Exam that's worth " + final_percent + "%");
        if (project_num > 0)
            System.out.println("- " + project_num + " projects that's worth " + project_percent + "%");
        if (participation_percent > 0)
            System.out.println("- " + "Participation that's worth " + participation_percent + "%");
        // Total percent:
        // REDO?
        double total = homework_percent + lab_percent + quiz_percent + project_percent + midterm1_percent +
                midterm2_percent + midterm3_percent + final_percent + participation_percent;
        System.out.println("---------------------");
        System.out.println("Your syllabus currently sums up to " + Math.round(total) + " percent");
        System.out.println("Do you want to re-do your syllabus?");
        System.out.println("1: Yes");
        System.out.println("2: No");
        System.out.print("Enter 1 or 2: ");
        int choice = sc.nextInt();
        if (choice == 1)
            syllabusPrinter(name, semester);
        else {
            System.out.println("Your syllabus is created.");
            if (homework_num > 0)
            {
                homework_grade = new double[homework_num];
                for(int i = 0; i < homework_num; i++)
                {
                    System.out.print("Enter your homework " + (i+1) + " grade (%): ");
                    homework_grade[i] = sc.nextDouble();
                }
            }
            if (lab_num > 0)
            {
                lab_grade = new double[lab_num];
                for(int i = 0; i < lab_num; i++)
                {
                    System.out.print("Enter your lab " + (i+1) + " grade (%): ");
                    lab_grade[i] = sc.nextDouble();
                }
            }
            if (quiz_num > 0)
            {
                quiz_grade = new double[quiz_num];
                for(int i = 0; i < quiz_num; i++)
                {
                    System.out.print("Enter your quiz " + (i+1) + " grade (%): ");
                    quiz_grade[i] = sc.nextDouble();
                }
            }
            if (midterm1_percent > 0)
            {
                System.out.print("Enter your midterm 1 grade (%): ");
                midterm1_grade = sc.nextDouble();
            }
            if (midterm2_percent > 0)
            {
                System.out.print("Enter your midterm 2 grade (%): ");
                midterm2_grade = sc.nextDouble();
            }
            if (midterm3_percent > 0)
            {
                System.out.print("Enter your midterm 3 grade (%): ");
                midterm3_grade = sc.nextDouble();
            }
            if (final_percent > 0)
            {
                System.out.print("Enter your final exam grade (%): ");
                final_grade = sc.nextDouble();
            }
            if (project_num > 0)
            {
                project_grade = new double[project_num];
                for(int i = 0; i < quiz_num; i++)
                {
                    System.out.print("Enter your project " + (i+1) + " grade (%): ");
                    project_grade[i] = sc.nextDouble();
                }
            }
            if (participation_percent > 0)
            {
                System.out.print("Enter your participation grade (%): ");
                participation_grade = sc.nextDouble();
            }
            int user_choice;
            do {
                System.out.println("***********************");
                System.out.println("What do you want to do?");
                System.out.println("1. Calculate Total Grade");
                System.out.println("2. Calculate Homework Grade");
                System.out.println("3. Calculate Lab Grade");
                System.out.println("4. Calculate Quiz Grade");
                System.out.println("5. Calculate Project Grade");
                System.out.println("6. Calculate How Much Final Grade You Need To Get A Certain Grade");
                System.out.println("7. Calculate Current Grade");
                System.out.println("8. Print Report");
                System.out.println("0. Exit program");
                System.out.print("Enter a number: ");
                user_choice = sc.nextInt();
                double course_grade = 0;
                if (user_choice == 1)
                {
                    double ret = 0;
                    if (homework_grade.length > 0)
                    {
                        for(int i = 0; i < homework_grade.length; i++)
                            ret += homework_grade[i];
                        course_grade += (ret / homework_grade.length * (homework_percent / 100));
                        ret = 0;
                    }

                    if (lab_grade.length > 0)
                    {
                        for(int i = 0; i < lab_grade.length; i++)
                            ret += lab_grade[i];
                        course_grade += ret / lab_grade.length * (lab_percent / 100);
                        ret = 0;
                    }

                    if (quiz_grade.length > 0)
                    {
                        for(int i = 0; i < quiz_grade.length; i++)
                            ret += quiz_grade[i];
                        course_grade += ret / quiz_grade.length * (quiz_percent / 100);
                        ret = 0;
                    }
                    if (midterm1_grade > 0)
                        course_grade += midterm1_grade * (midterm1_percent / 100);
                    if (midterm2_grade > 0)
                        course_grade += midterm2_grade * (midterm2_percent / 100);
                    if (midterm3_grade > 0)
                        course_grade += midterm3_grade * (midterm3_percent / 100);
                    if (final_grade > 0)
                        course_grade += final_grade * (final_percent / 100);
                    if(project_grade.length > 0)
                    {
                        for(int i = 0; i < project_grade.length; i++)
                            ret += project_grade[i];
                        course_grade += ret / project_grade.length * (project_percent / 100);
                    }
                    if(participation_grade > 0)
                        course_grade += participation_grade * (participation_percent / 100);
                    System.out.println("Total Grade: " + course_grade + " / 100.0 (" + course_grade + "%)");
                }
                else if(user_choice == 2)
                {
                    double ret = 0;
                    for(int i = 0; i < homework_grade.length; i++)
                        ret += homework_grade[i];
                    System.out.println("Homework Grade: " + (ret / homework_grade.length * homework_percent / 100) +
                            " / " + homework_percent + " (" + ret / homework_grade.length + "%)");
                }
                else if(user_choice == 3)
                {
                    double ret = 0;
                    for(int i = 0; i < lab_grade.length; i++)
                        ret += lab_grade[i];
                    System.out.println("Lab Grade: " + (ret / lab_grade.length * lab_percent / 100) +
                            " / " + lab_percent + " (" + ret / lab_grade.length + "%)");
                }
                else if(user_choice == 4)
                {
                    double ret = 0;
                    for(int i = 0; i < quiz_grade.length; i++)
                        ret += quiz_grade[i];
                    System.out.println("Quiz Grade: " + (ret / quiz_grade.length * quiz_percent / 100) +
                            " / " + quiz_percent + " (" + ret / quiz_grade.length + "%)");
                }
                else if(user_choice == 5)
                {
                    double ret = 0;
                    for(int i = 0; i < project_grade.length; i++)
                        ret += project_grade[i];
                    System.out.println("Project Grade: " + (ret / project_grade.length * project_percent / 100) +
                            " / " + project_percent + " (" + ret / project_grade.length + "%)");
                }
                else if(user_choice == 6)
                {
                    System.out.print("Enter the grade you want: ");
                    double grade_wanted = sc.nextDouble();
                    double ret = 0;
                    if (homework_grade.length > 0)
                    {
                        for(int i = 0; i < homework_grade.length; i++)
                            ret += homework_grade[i];
                        course_grade += (ret / homework_grade.length * (homework_percent / 100));
                        ret = 0;
                    }

                    if (lab_grade.length > 0)
                    {
                        for(int i = 0; i < lab_grade.length; i++)
                            ret += lab_grade[i];
                        course_grade += ret / lab_grade.length * (lab_percent / 100);
                        ret = 0;
                    }

                    if (quiz_grade.length > 0)
                    {
                        for(int i = 0; i < quiz_grade.length; i++)
                            ret += quiz_grade[i];
                        course_grade += ret / quiz_grade.length * (quiz_percent / 100);
                        ret = 0;
                    }
                    if (midterm1_grade > 0)
                        course_grade += midterm1_grade * (midterm1_percent / 100);
                    if (midterm2_grade > 0)
                        course_grade += midterm2_grade * (midterm2_percent / 100);
                    if (midterm3_grade > 0)
                        course_grade += midterm3_grade * (midterm3_percent / 100);
                    if(project_grade.length > 0)
                    {
                        for(int i = 0; i < project_grade.length; i++)
                            ret += project_grade[i];
                        course_grade += ret / project_grade.length * (project_percent / 100);
                    }
                    if(participation_grade > 0)
                        course_grade += participation_grade * (participation_percent / 100);
                    System.out.println("You need: " + (grade_wanted - course_grade) + " / " + final_percent + " in your final exam ("
                            + (grade_wanted - course_grade) / final_percent * 100 + "%)");
                }
                else if(user_choice == 7)
                {
                    System.out.println("Note: We are assuming that you do not have any grade that is 0");
                    double ret = 0;
                    double over = 0;
                    if (homework_grade.length > 0)
                    {
                        for(int i = 0; i < homework_grade.length; i++)
                        {
                            if (homework_grade[i] > 0) {
                                ret += homework_grade[i];
                                over += homework_percent / homework_grade.length;
                            }
                        }
                        course_grade += (ret / homework_grade.length * (homework_percent));
                        ret = 0;
                    }

                    if (lab_grade.length > 0)
                    {
                        for(int i = 0; i < lab_grade.length; i++)
                        {
                            if (lab_grade[i] > 0) {
                                ret += lab_grade[i];
                                over += lab_percent / lab_grade.length;
                            }
                        }
                        course_grade += ret / lab_grade.length * (lab_percent);
                        ret = 0;
                    }

                    if (quiz_grade.length > 0)
                    {
                        for(int i = 0; i < quiz_grade.length; i++)
                        {
                            if (quiz_grade[i] > 0) {
                                ret += quiz_grade[i];
                                over += quiz_percent / quiz_grade.length;
                            }
                        }
                        course_grade += ret / quiz_grade.length * (quiz_percent);
                        ret = 0;
                    }
                    if (midterm1_grade > 0) {
                        course_grade += midterm1_grade * (midterm1_percent);
                        over += midterm1_percent;
                    }
                    if (midterm2_grade > 0) {
                        course_grade += midterm2_grade * (midterm2_percent);
                        over += midterm2_percent;
                    }
                    if (midterm3_grade > 0) {
                        course_grade += midterm3_grade * (midterm3_percent);
                        over += midterm3_percent;
                    }
                    if (final_grade > 0) {
                        course_grade += final_grade * (final_percent);
                        over += final_percent;
                    }
                    if(project_grade.length > 0)
                    {
                        for(int i = 0; i < project_grade.length; i++)
                        {
                            if (project_grade[i] > 0) {
                                ret += project_grade[i];
                                over += project_percent / project_grade.length;
                            }
                        }
                        course_grade += ret / project_grade.length * (project_percent);
                    }
                    if(participation_grade > 0) {
                        course_grade += participation_grade * (participation_percent);
                        over += participation_percent;
                    }
                    course_grade = course_grade / 100;
                    System.out.println("Current Grade: " + course_grade + " / " + over + " (" + (course_grade / over * 100) + "%)");
                }
                else if(user_choice == 8)
                {
                    double ret = 0;

                    for(int i = 0; i < homework_grade.length; i++)
                        ret += homework_grade[i];
                    double report_homework_grade = ret / homework_grade.length;

                    ret = 0;
                    for(int i = 0; i < lab_grade.length; i++)
                        ret += lab_grade[i];
                    double report_lab_grade = ret / lab_grade.length;

                    ret = 0;
                    for(int i = 0; i < quiz_grade.length; i++)
                        ret += quiz_grade[i];
                    double report_quiz_grade = ret / quiz_grade.length;

                    int hitung = 0;
                    if(midterm1_grade > 0)
                        hitung += 1;
                    if(midterm2_grade > 0)
                        hitung += 1;
                    if(midterm3_grade > 0)
                        hitung += 1;
                    double[] midterm_array = new double[hitung];
                    if(hitung > 0)
                        midterm_array[0] = midterm1_grade;
                    if(hitung > 1)
                        midterm_array[1] = midterm2_grade;
                    if(hitung > 2)
                    midterm_array[2] = midterm3_grade;

                    double average_midterm = 0;
                    for (int a = 0; a < midterm_array.length; a++) {
                        if (a == 0)
                            average_midterm += midterm_array[a] * midterm1_percent ;
                        else if (a == 1)
                            average_midterm += midterm_array[a] * midterm2_percent;
                        else
                            average_midterm += midterm_array[a] * midterm3_percent;
                    }

                    double report_midterm_grade = 0;
                    if(midterm_array.length == 1)
                        report_midterm_grade = average_midterm / midterm1_percent;
                    if(midterm_array.length == 2)
                        report_midterm_grade = average_midterm / (midterm1_percent + midterm2_percent);
                    if(midterm_array.length == 3)
                        report_midterm_grade = average_midterm / (midterm1_percent + midterm2_percent + midterm3_percent);


                    double report_final_grade = final_grade;

                    ret = 0;
                    for(int i = 0; i < project_grade.length; i++)
                        ret += project_grade[i];
                    double report_project_grade = ret / quiz_grade.length;

                    double report_participation_grade = participation_grade;

                    ret = 0;
                    double over = 0;
                    if (homework_grade.length > 0)
                    {
                        for(int i = 0; i < homework_grade.length; i++)
                        {
                            if (homework_grade[i] > 0) {
                                ret += homework_grade[i];
                                over += homework_percent / homework_grade.length;
                            }
                        }
                        course_grade += (ret / homework_grade.length * (homework_percent));
                        ret = 0;
                    }

                    if (lab_grade.length > 0)
                    {
                        for(int i = 0; i < lab_grade.length; i++)
                        {
                            if (lab_grade[i] > 0) {
                                ret += lab_grade[i];
                                over += lab_percent / lab_grade.length;
                            }
                        }
                        course_grade += ret / lab_grade.length * (lab_percent);
                        ret = 0;
                    }

                    if (quiz_grade.length > 0)
                    {
                        for(int i = 0; i < quiz_grade.length; i++)
                        {
                            if (quiz_grade[i] > 0) {
                                ret += quiz_grade[i];
                                over += quiz_percent / quiz_grade.length;
                            }
                        }
                        course_grade += ret / quiz_grade.length * (quiz_percent);
                        ret = 0;
                    }
                    if (midterm1_grade > 0) {
                        course_grade += midterm1_grade * (midterm1_percent);
                        over += midterm1_percent;
                    }
                    if (midterm2_grade > 0) {
                        course_grade += midterm2_grade * (midterm2_percent);
                        over += midterm2_percent;
                    }
                    if (midterm3_grade > 0) {
                        course_grade += midterm3_grade * (midterm3_percent);
                        over += midterm3_percent;
                    }
                    if (final_grade > 0) {
                        course_grade += final_grade * (final_percent);
                        over += final_percent;
                    }
                    if(project_grade.length > 0)
                    {
                        for(int i = 0; i < project_grade.length; i++)
                        {
                            if (project_grade[i] > 0) {
                                ret += project_grade[i];
                                over += project_percent / project_grade.length;
                            }
                        }
                        course_grade += ret / project_grade.length * (project_percent);
                        ret = 0;
                    }
                    if(participation_grade > 0) {
                        course_grade += participation_grade * (participation_percent);
                        over += participation_percent;
                    }
                    course_grade = course_grade / 100;
                    System.out.println("Current Grade: " + course_grade + " / " + over + " (" + (course_grade / over * 100) + "%)");
                    double report_current_grade = course_grade;


                    course_grade = 0;
                    ret = 0;
                    if (homework_grade.length > 0)
                    {
                        for(int i = 0; i < homework_grade.length; i++)
                            ret += homework_grade[i];
                        course_grade += (ret / homework_grade.length * (homework_percent / 100));
                        ret = 0;
                    }

                    if (lab_grade.length > 0)
                    {
                        for(int i = 0; i < lab_grade.length; i++)
                            ret += lab_grade[i];
                        course_grade += ret / lab_grade.length * (lab_percent / 100);
                        ret = 0;
                    }

                    if (quiz_grade.length > 0)
                    {
                        for(int i = 0; i < quiz_grade.length; i++)
                            ret += quiz_grade[i];
                        course_grade += ret / quiz_grade.length * (quiz_percent / 100);
                        ret = 0;
                    }
                    if (midterm1_grade > 0)
                        course_grade += midterm1_grade * (midterm1_percent / 100);
                    if (midterm2_grade > 0)
                        course_grade += midterm2_grade * (midterm2_percent / 100);
                    if (midterm3_grade > 0)
                        course_grade += midterm3_grade * (midterm3_percent / 100);
                    if (final_grade > 0)
                        course_grade += final_grade * (final_percent / 100);
                    if(project_grade.length > 0)
                    {
                        for(int i = 0; i < project_grade.length; i++)
                            ret += project_grade[i];
                        course_grade += ret / project_grade.length * (project_percent / 100);
                        ret = 0;
                    }
                    if(participation_grade > 0)
                        course_grade += participation_grade * (participation_percent / 100);
                    double report_total_grade = course_grade;



                    System.out.println("---------------------- CLASS REPORT ----------------------");
                    System.out.println("Class Name: " + name);
                    System.out.println("Semester: " + semester);
                    System.out.println("Homework Grade: " + Arrays.toString(homework_grade) + ", " + report_homework_grade + "%");
                    System.out.println("Lab Grade: "  + Arrays.toString(lab_grade) + ", " + report_lab_grade + "%");
                    System.out.println("Quiz Grade: "  + Arrays.toString(quiz_grade) + ", " + report_quiz_grade + "%");
                    System.out.println("Midterm Grade: " + Arrays.toString(midterm_array) + ", " + report_midterm_grade + "%");
                    System.out.println("Final Exam Grade: " + report_final_grade + "%");
                    System.out.println("Project Grade: " + report_project_grade + "%");
                    System.out.println("Participation Grade: " + report_participation_grade + "%");
                    System.out.println("Current Grade: " + report_current_grade + " / " + over + " (" + (course_grade / over * 100) + "%)");
                    System.out.println("Total Grade: " + report_total_grade + "%");
                    System.out.println("---------------------- CLASS REPORT ----------------------");
                }
                else
                    System.out.println("Thank you for using grade book! All your data has been erased for privacy.");
            }
            while (user_choice != 0);
        }
    }
    public static void main(String[] args) {
        // OPENING STATEMENT
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to your grade book app!");
        System.out.println("Here are the rules: ");
        System.out.println("1. If you don't know your grade, enter 0");
        System.out.println("2. Everything is in percentage");
        System.out.println("3. Your class name and current semester can be anything you want");
        System.out.println("4. Everything else will be in numbers");
        System.out.println("5. Happy Calculating Your Score!");
        System.out.print("Enter your class name: ");
        String class_name = sc.nextLine();
        System.out.print("Enter your current semester: ");
        String curr_semester = sc.nextLine();
        syllabusPrinter(class_name, curr_semester);
    }
}

/*
Homework");
        System.out.println("2. Labs");
        System.out.println("3. Quiz");
        System.out.println("4. Midterm 1");
        System.out.println("5. Midterm 2");
        System.out.println("6. Midterm 3");
        System.out.println("7. Final Exam");
        System.out.println("8. Project");
        System.out.println("9. Participation");
        System.out.println("0. Other Categories"
 */
