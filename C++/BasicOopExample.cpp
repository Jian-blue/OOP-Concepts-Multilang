// Filename: BasicOopExample.cpp
// Description: All basic concepts of OOP are written in C++
// Source: CodeBeauty YT
// Author: Jian-blue

#include <bits/stdc++.h>
using namespace std;

/// অ্যাবস্ট্রাকশনের কন্ট্রাক্ট হিসেবে কাজ করবে
class AbstractEmployee
{
    virtual void askForPromotion() = 0;
};

class Employee : AbstractEmployee /// Class তৈরি করা
{
private: /// এক্সেস মডিফায়ার ৩ প্রকার - private(ডিফল্ট), public, protected
    string Name;
    int Age;
    double Salary;

public:
    /// কন্সট্রাক্টর তৈরি করা
    Employee(string name, int age, double salary)
    {
        Name = name;
        Age = age;
        Salary = salary;
    }

    /// এনক্যাপসুলেশন: getter আর setter তৈরি করা
    void setName(string name)
    {
        Name = name;
    }

    void setAge(int age)
    {
        Age = age;
    }

    void setSalary(double salary)
    {
        Salary = salary;
    }

    string getName()
    {
        return Name;
    }

    int getAge()
    {
        return Age;
    }

    double getSalary()
    {
        return Salary;
    }

    /// নরমাল ফাংশন দিয়ে প্রিন্ট করা আরকি
    void printEmpInfo()
    {
        cout << "Employee name: " << right << setw(12) << Name << endl
             << "Employee Age: " << right << setw(13) << Age << endl
             << "Employee Salary: " << right << setw(10) << Salary << endl;
    }

    /// অ্যাবস্ট্রাকশন: জটিল ফাংশন বা প্রসেস এইসবের জন্য
    void askForPromotion()
    {
        if (Age >= 35)
            cout << "Congratulation, " << Name << " you got promoted!" << endl;
        else
            cout << "Sorry, No promotion for you, " << Name << "." << endl;
    }

    /// পলিমরফিজম
    virtual void work()         /// ভার্চুয়াল ফাংশন ব্যবহার করার কারণ:
    {          /// নিজ নিজ class এ যদি পলিমরফিজমের ফাংশন থাকে তাহলে সেটা প্রসেস করবে নাহলে প্যারেন্ট ক্লাস এর এই ভার্চুয়াল ফাংশন এক্সিকিউট হবে
        cout << Name << " is working." << endl;
    }
};

/// ইনহেরিটেন্স class-1
class Developer : public Employee
{
public:
    string FavProgLangu;

    /// কন্সট্রাক্টর
    Developer(string name, int age, double salary, string favProgLangu)
        : Employee(name, age, salary)
    {
        FavProgLangu = favProgLangu;
    }

    void bugFix()
    {
        cout << "For Any Bug Fix in " << FavProgLangu << " contact: " << getName() << endl;
    }

    /// পলিমরফিজমের ফাংশন
    void work()
    {
        cout << getName() << " is working in " << FavProgLangu << endl;
    }
};

/// ইনহেরিটেন্স class-2
class CEO : public Employee
{
public:
    string Position;

    /// কন্সট্রাক্টর
    CEO(string name, int age, double salary, string position)
        : Employee(name, age, salary)
    {
        Position = position;
    }

    void printCEO()
    {
        cout << getName() << " is the CEO of " << Position << endl;
    }

    /// পলিমরফিজমের ফাংশন
    void work()
    {
        cout << getName() << " is working as CEO of " << Position << endl;
    }
};

int main()
{
    /// ভ্যালু এসাইন আর প্রিন্ট করা
    Employee emp1 = Employee("Lu Wei", 30, 2700.00);
    Employee emp2 = Employee("Zi Chew", 28, 1800.50);

    emp1.printEmpInfo();
    cout << endl;
    emp2.printEmpInfo();

    /// এনক্যাপসুলেশন
    emp2.setName("Xusn Yei");
    emp2.setAge(37);
    emp2.setSalary(4100.80);

    cout << endl;
    emp2.printEmpInfo();

    /// অ্যাবস্ট্রাকশন
    cout << endl;
    emp1.askForPromotion();
    emp2.askForPromotion();

    /// ইনহেরিটেন্স
    Developer dev1 = Developer("Fei Tiang", 46, 5000.00, "C++");
    cout << endl;
    dev1.bugFix();
    dev1.askForPromotion();

    CEO ceo1 = CEO("Solon Lee", 26, 3600.55, "Kuro Games");
    CEO ceo2 = CEO("Lu Wei", 30, 2700.00, "Hoyoverse");
    cout << endl;
    ceo1.printCEO();
    ceo2.printCEO();

    /// পলিমরফিজম
    cout << endl;
    emp1.work();
    dev1.work();
    ceo1.work();
    cout << endl;

    /// পলিমরফিজম - পয়েন্টার ব্যবহার করে
    Employee *emp3 = &ceo2;
    emp3->work();
    cout << endl;
    
}
