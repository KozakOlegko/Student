package Student.Logic;

import java.text.Collator;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.zip.DataFormatException;

/**
 * Created by ko3ak_000 on 11.01.2015.
 */
public class Student implements Comparable
{
    private int studentId;
    private String firstName;
    private String surName;
    private String patronymic;
    private Date dateOfBirth;
    private char sex;
    private int groupId;
    private int educationYear;


    // getter and setters
    // date of birth
    public Date getDateOfBirth()
    {
        return dateOfBirth;
    }

    public void setDateOfBirth (Date dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }
    // educational year
    public int getEducationYear()
    {
        return educationYear;
    }
    public void setEducationYear (int educationYear)
    {
        this.educationYear = educationYear;
    }
    // ID group
    public int getGroupId ()
    {
        return groupId;
    }

    public void setGroupId (int groupId)
    {
        this.groupId = groupId;
    }
    //id student

    public int getStudentId()
    {
        return studentId;
    }
    public void setStudentId(int studentId)
    {
        this.studentId = studentId;
    }

    // name

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    // parental name

    public String getPatronymic()
    {
        return patronymic;
    }
    public void setPatronymic(String patronymic)
    {
        this.patronymic = patronymic;
    }

    //surname

    public String getSurName()
    {
        return surName;
    }

    public void setSurName(String surName)
    {
        this.surName = surName;
    }

    //sex

    public char getSex (char sex)
    {
        return sex;
    }

    public void setSex (char sex)
    {
        this.sex = sex;
    }

    public String toString()
    {
        return surName + " " + firstName+" "+patronymic+", "
                + DateFormat.getDateInstance(DateFormat.SHORT).format(dateOfBirth)
                +",group ID="+ groupId+ "Year: "+educationYear;
    }

    public int compareTo (Object obj)
    {
        Collator c = Collator.getInstance(new Locale("ru"));
        c.setStrength(Collator.PRIMARY);
        return c.compare(this.toString(), obj.toString());
    }

}
