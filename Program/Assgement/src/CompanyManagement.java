 

import java.util.*;
import java.io.*;

public class CompanyManagement {

    private ArrayList<Employee> empList = new ArrayList();

    public CompanyManagement(String path, String path1) throws Exception {
        empList = getEmployeeFromFile(path, path1);
    }

    public ArrayList<Employee> getEmployeeFromFile(String path, String path1) throws Exception {

        ArrayList<Employee> eList = new ArrayList();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            BufferedReader br1 = new BufferedReader(new FileReader(path1));
            String line;
            HashMap<String, ArrayList<String>> mp = new HashMap();
            while ((line = br1.readLine()) != null) {
                String[] ls = line.split(",");
                ArrayList<String> list = new ArrayList<>(Arrays.asList(ls));
                list.remove(0);
                mp.put(ls[0], list);
            }
            while ((line = br.readLine()) != null) {
                String[] ls = line.split(",");
                if (ls[1].startsWith("D")) {
                    if (ls[5].compareToIgnoreCase("L") == 0) {
                        eList.add(new TeamLeader(ls[1],ls[2],Integer.parseInt(ls[7]),ls[3],mp.get(ls[1]),Integer.parseInt(ls[4]),Double.parseDouble(ls[6])));
                    } else {
                        eList.add(new Developer(ls[1], ls[2], Integer.parseInt(ls[5]), ls[3], mp.get(ls[1]), Integer.parseInt(ls[4])));
                    }
                } else if (ls[1].startsWith("T")) {
                    eList.add(new Tester(ls[1], ls[2], Integer.parseInt(ls[5]), Double.parseDouble(ls[3]), ls[4]));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return eList;
    }

    public ArrayList<Developer> getDeveloperByProgrammingLanguage(String pl) {
        ArrayList<Developer> dList = new ArrayList();


            if(empList != null) {
            for (Employee emp: empList)  {
                if(emp instanceof Developer) {
                    Developer dev = (Developer) emp;
                    ArrayList<String> arrPL = dev.getProgrammingLanguages();
                    boolean check = false;
                    if(arrPL != null) {
                        for (String o : arrPL) {
                            if(o. equals(pl)) {
                                check = true;
                                break;
                            }
                            
                        }
                    }
                    if(check) {
                        if(dList == null) {
                            dList = new ArrayList<>();
                        }
                        dList.add(dev);
                    }
                }
                
            }
        }
        return dList;
    }

    public ArrayList<Tester> getTestersHaveSalaryGreaterThan(double value) {
        ArrayList<Tester> tList = new ArrayList();
        for (Employee o : empList) {
            if (o instanceof Tester && ((Tester) o).getSalary() > value) {
                tList.add((Tester) o);
            }
        }
        return tList;
    }

    public ArrayList<Employee> getEmployeesHaveSalaryGreaterThan(double value) {
        ArrayList<Employee> tList = new ArrayList();
        for (Employee o : empList) {
            if (o.getSalary() > value) {
                tList.add(o);
            }
        }
        return tList;
    }

    public Employee getEmployeeWithHighestSalary() {
        if (empList == null || empList.isEmpty()) {
            return null;
        }
        Employee rEmp = empList.get(0);
        
        for (Employee o : empList) {
            if (rEmp.getSalary() < o.getSalary()) {
                rEmp = o;
            }
        }

        return rEmp;
    }

    public TeamLeader getLeaderWithMostEmployees() {
        Map<String, ArrayList<Employee>> team = new HashMap();
        Map<String, TeamLeader> tLeader = new HashMap();
        ArrayList<Employee> list;
        String teamName = "";
        for (Employee o : empList) {
            if (o instanceof TeamLeader) {
                teamName = ((TeamLeader)o).getTeamName();
                tLeader.put(teamName, (TeamLeader) o);
            } else if (o instanceof Developer) {
                teamName = ((Developer) o).getTeamName();
                if (team.containsKey(teamName)) {
                    team.get(teamName).add(o);
                } else {
                    list = new ArrayList();
                    list.add(o);
                    team.put(teamName, list);
                }
            }
        }
        int cnt = 0;
        for (Map.Entry<String, ArrayList<Employee>> entry : team.entrySet()) {
            if (entry.getValue().size() > cnt) {
                cnt = entry.getValue().size();
                teamName = entry.getKey();
            }
        }
        return tLeader.get(teamName);
    }

    public ArrayList<Employee> sorted() {
        ArrayList<Employee> sortedList = (ArrayList<Employee>) empList.clone();

            Collections.sort(sortedList, (Employee o1, Employee o2) -> {
                if(o1.getSalary() < o2.getSalary()) {
                    return 1;
                }
                else if(o1.getSalary() > o2.getSalary()) {
                    return -1;
                }
                else return 0;
        });
            return sortedList;
            

    }
    
  

    public void printEmpList() {
        empList.forEach(employee -> {
            System.out.println(employee.toString());
        });
    }

    public void printEmpList(ArrayList<Employee> list) {
        list.forEach(employee -> {
            System.out.println(employee.toString());
            
        });
    }

    public <E> boolean writeFile(String path, ArrayList<E> list) {
        try {
            File fileObj = new File(path);
            fileObj.createNewFile();
            FileWriter myWriter = new FileWriter(fileObj);
            for (E employee : list) {
                myWriter.write(employee.toString());
                myWriter.write("\n");
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("Error!!");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean writeFile(String path, Employee employee) {
        try {
            File fileObj = new File(path);
            fileObj.createNewFile();
            FileWriter myWriter = new FileWriter(fileObj);
            myWriter.write(employee.toString());
            myWriter.close();
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
