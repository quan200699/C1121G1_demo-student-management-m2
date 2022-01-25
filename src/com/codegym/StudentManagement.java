package com.codegym;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
    private List<Student> students = new ArrayList<>();

    public int size() {
        return students.size();
    }

    public void addNewStudent(Student student) {
        this.students.add(student);
    }

    public void displayAllStudent() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    //Tìm học viên theo mã học viên
    public int findStudentById(String id) {
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public Student getStudent(int index) {
        return students.get(index);
    }

    //Cập nhật thông tin học viên với mã học viên
    public void updateStudentById(String id, Student student) {
        int index = findStudentById(id);
        students.set(index, student);
    }

    //Xóa thông tin học viên với mã học viên tương ứng
    public boolean deleteStudentById(String id) {
        int index = findStudentById(id);
        if (index != -1) {
            students.remove(index);
            return true;
        } else {
            return false;
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < students.size(); i++) {
            for (int j = students.size() - 1; j > i; j--) {
                if (students.get(j).getMark() < students.get(j - 1).getMark()) {
                    Student temp = students.get(j);
                    students.set(j, students.get(j - 1));
                    students.set(j - 1, temp);
                }
            }
        }
    }

    public void selectionSort() {
        int min;
        for (int i = 0; i < students.size() - 1; i++) {
            min = i;
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(j).getMark() < students.get(min).getMark()) {
                    min = j;
                }
            }
            if (min != i) {
                Student temp = students.get(min);
                students.set(min, students.get(i));
                students.set(i, temp);
            }
        }
    }

    public void insertionSort() {
        int pos;
        Student x;
        for (int i = 1; i < students.size(); i++) {
            pos = i;
            x = students.get(i);
            while (pos > 0 && x.getMark() > students.get(pos - 1).getMark()) {
                students.set(pos, students.get(pos - 1));
                pos--;
            }
            students.set(pos, x);
        }
    }

    public void bubbleSortById() {
        for (int i = 0; i < students.size(); i++) {
            for (int j = students.size() - 1; j > i; j--) {
                if (students.get(j).getId().compareTo(students.get(j - 1).getId()) > 0) {
                    Student temp = students.get(j);
                    students.set(j, students.get(j - 1));
                    students.set(j - 1, temp);
                }
            }
        }
    }

    //Tìm kiếm nhị phân
    public int findStudentUsingBinarySearch(String id) {
        bubbleSortById();
        int low = 0;
        int high = students.size() - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (students.get(middle).getId().equals(id)) {//equal sử dụng để so sánh 2 chuỗi = nhau => true là bằng nhau false là không bằng
                return middle;// == chỉ sử dụng được cho kiểu nguyên thủy
            } else if (students.get(middle).getId().compareTo(id) > 0) { //id nhỏ hơn gốc
                //compareTo: a.compareTo(b) => nếu phương thức trả về > 0 => có nghĩa là a > b, trả về < 0 nghĩa là a < b, = 0 là 2 cái = nhau
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }
}
