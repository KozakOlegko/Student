package Student.Logic;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Collection;
import java.util.List;

import static javax.xml.bind.DatatypeConverter.printString;

/**
 * Created by ko3ak_000 on 11.01.2015.
 */
public class ManagementSystem
{
    private List <Group> groups;
    private Collection<Student> students;

    private static ManagementSystem instance;

    private ManagementSystem()
    {
        loadGroups();
        loadStudents();
    }

    public static synchronized ManagementSystem getInstance()
    {
        if (instance == null)
        {
            instance = new ManagementSystem();
        }
        return instance;
    }

    public static void main(String[] args)
    {
        try
        {
            System.setOut(new PrintStream("out.txt"));
        }
        catch (FileNotFoundException ex)
        {
            ex.printStackTrace();
            return;
        }

        ManagementSystem ms= ManagementSystem.getInstance();

        printString("ssss");

    }
}
