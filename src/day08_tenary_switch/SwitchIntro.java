package day08_tenary_switch;

public class SwitchIntro {
    public static void main(String[] args) {
/*Switch satement: switch, case, default, break
    syntax:
        switch(Data/Variable){
            case data1:
                Statements;
                break;
            case data2:
                Statements;
                break;
            default:
                Statements;
        }
        Switch' expression (Data) can not be boolean, float, double, long
        Case value must be UNIQUE, and must match with switch expression's data type
        break: used for exiting the switch
        default block gets executed if none of the case values matched with swithc' expression
        or logic we can use it in switch by declaring the case blocks back to back
*/
        char grade ='Q';
        String result = "";
        switch(grade){ //Faster than if and else
            case 'A':
                result="Excellent";
                break;
            case 'B':
                result="Great Job";
                break;
            case 'C':
                result="Good";
                break;
            case 'D':
                result="Passed";
                break;
            case 'F':
                result="Fialed";
                break;
            default:
                result = "Invalid Grade";
                break;
        }
        System.out.println("result = " + result);

  /*
        A: Excellent
        B: Great Job
        C: Good
        D: Passed
        F: Failed
         */

        /*
        String result;
        if (grade == 'A'){
            result = "Excellent";
        }else if (grade == 'B'){
            result = "Great Job";
        }else if(grade == 'C'){
            result = "Good";
        }else if(grade == 'D'){
            result = "Passed";
        }else {
            result = "Failed";
        }
        System.out.println(result);
        System.out.println("----------------------------------");
*/
    }
}
