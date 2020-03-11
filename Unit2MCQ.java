public class Unit2MCQ
{
    //I changed Thing to Unit2MCQ because is it a constructor, and has to match the class name.Initializes to blue.
    private String color; 
    public Unit2MCQ() 
    {
        color = "Blue"; 
    }

    public Unit2MCQ(String setColor) 
    {
        color = setColor; 
    }

    //Question: Which of the following code segments, when appearing in a class other than Thing would create a 
    //reference of type Thing with a value of null? 
    /* A= Thing someThing = new Thing("Green"); 
     * B= Thing someThing = new Thing(""); 
     * C= Thing someThing = new Thing(); 
     * D= Thing someThing; <-- ANSWER
     * E= Thing("Green"); 
     */

    //the variable is never initialized in D, so the value would be null until assigned, 
    // so the answer is D. 
    
    ///////////////////////2.9 MCQ Skill 1.B Using the math class//////////////////////
    //Question: Which of the following can beused to replace /* missing code*/ so that the code segment works as intended?
    //System.out.println(Math.random() * 4 + 1); 
}
