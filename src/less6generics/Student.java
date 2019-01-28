/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package less6generics;

/**
 *
 * @author Dark Magician
 */
public class Student {
    String id;
    String name;
    double salary;
    
    public void setID(String id)
    {
        this.id = id;
    }
    
    public String getID()
    {
        return this.id;
    }
    
    public void setName(String name)
    {
        this.name= name;
    }
    public String getName()
    {
        return this.name;
    }
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    public Student(String id,String name,double salary)
    {
        this.id= id;
        this.name= name;
        this.salary= salary;
    }
    
    @Override
    public String toString()
    {
        return id+"\t"+name+"\t"+salary+"\n";
    }
    
}
