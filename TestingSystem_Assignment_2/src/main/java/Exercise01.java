import java.time.LocalDate;

public class Exercise01 {
    public static void main(String[] args) {
        Department department1 = new Department();
        department1.id = 1;
        department1.name = "Sale";

        Department department2 = new Department();
        department2.id = 2;
        department2.name = "Marketting";

        Department department3 = new Department();
        department3.id = 3;
        department3.name = "BOD";

        Position position1 = new Position();
        position1.id = 1;
        position1.name = Position.PositionName.DEV;

        Position position2 = new Position();
        position2.id = 2;
        position2.name = Position.PositionName.PM;

        Position position3 = new Position();
        position3.id = 3;
        position3.name = Position.PositionName.SCRUM_MASTER;

        Group group1 = new Group();
        group1.id = 1;
        group1.name = "Java Fresher";

        Group group2 = new Group();
        group2.id = 2;
        group2.name = "C# Fresher";

        Group group3 = new Group();
        group3.id = 3;
        group3.name = "Python Fresher";

        Account account1 = new Account();
        account1.id = 1;
        account1.email = "haidnag@gmail.com";
        account1.groups = new Group[]{group1, group2};
        account1.position = position1;
        account1.department = department1;
        account1.fullName = "Nguyễn Hải Đăng";
        account1.createDate = LocalDate.of(2020, 03, 7);
        account1.userName = "haidangproductions";

        Account account2 = new Account();
        account2.id = 2;
        account2.email = "nguyenhaithinh@gmail.com";
        account2.groups = new Group[]{group1};
        account2.position = position2;
        account2.department = department2;
        account2.fullName = "Nguyễn Hải Thinh";
        account2.createDate = LocalDate.of(2020, 01, 9);
        account2.userName = "thinhblack";

        Account account3 = new Account();
        account3.id = 3;
        account3.email = "hongque@gmail.com";
        account3.groups = new Group[]{group1, group2, group3};
        account3.position = position3;
        account3.department = department3;
        account3.fullName = "Nguyễn Hong Que";
        account3.createDate = LocalDate.of(2020, 03, 19);
        account3.userName = "quetun";

        // add account to group
        Account[] accountOfGroups1 = {account1, account2, account3};
        group1.accounts = accountOfGroups1;

//            Question1:
            if (account2.department == null) {
                System.out.println("Nhân viên này chưa có phòng ban");
            } else
                System.out.println("Phòng ban của nhân viên này là: " + account2.department.name);
        System.out.println();

//            Question2:
        if(account2.groups == null || account2.groups.length == 0) {
            System.out.println("Nhân viên này chưa có group");
        } else if (account2.groups.length == 1 || account2.groups.length == 2) {
            System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
        } else if (account2.groups.length == 3) {
            System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
        } else {
            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }
        System.out.println();

//        Question3:
        System.out.println(account2.department == null ? "Nhân viên này chưa có phòng ban." : "Phòng của nhân viên này là: " + account2.department.name);
        System.out.println();

//        Question4:
        System.out.println(account1.position.name == Position.PositionName.DEV ? "Đây là Developer" : "Người này không phải là Developer");
        System.out.println();

//        Question5:
        if (group1.accounts == null) {
            System.out.println("Group chưa có thành viên");
        } else {
            int countAccInGroup = group1.accounts.length;
            switch (countAccInGroup) {
                case 1:
                    System.out.println("Nhóm có một thành viên");
                    break;
                case 2:
                    System.out.println("Nhóm có hai thành viên");
                    break;
                case 3:
                    System.out.println("Nhóm có ba thành viên");
                    break;
                default:
                    System.out.println("Nhóm có nhiều thành viên");
                    break;
            }
        }
        System.out.println();

//        Question6:
        if (account2.groups == null) {
            System.out.println("Nhân viên này chưa có group");
        } else {
            switch (account2.groups.length) {
                case 1:
                    System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
                    break;
                case 2:
                    System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
                    break;
                case 3:
                    System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
                    break;
                default:
                    System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
                    break;
            }
        }
        System.out.println();

//        Question7:
        switch (account1.position.name) {
            case DEV:
                System.out.println("Đây là Developer.");
                break;
            default:
                System.out.println("Người này không phải là Developer");
                break;
        }
        System.out.println();

//        Question8:
        Account[] accounts = {account1,account2,account3};
        for (Account account : accounts) {
            System.out.println("Email: " + account.email);
            System.out.println("FullName: " + account.fullName);
            System.out.println("Department Name: " + account.department.name);
        }
        System.out.println();

//        Question9:
        Department[] departments = {department1,department2,department3};
        for (Department department : departments) {
            System.out.println("Department ID: " + department.id);
            System.out.println("Department Name: " + department.name);
        }
        System.out.println();

//        Question10:
        Account[] accounts1 = {account1, account2};
        for (int i = 0; i < accounts1.length; i++) {
            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + accounts1[i].email);
            System.out.println("Full name: " + accounts1[i].fullName);
            System.out.println("Phòng ban: " + accounts1[i].department.name);
        }
        System.out.println();

//        Question11:
        Department[] departments1 = {department1,department2,department3};
        for (int i = 0; i < departments1.length; i++) {
            System.out.println("Thông tin department thứ " + (i +1) + " là:");
            System.out.println("ID: " + departments1[i].id);
            System.out.println("Name: " + departments1[i].name);
        }
        System.out.println();

//        Question12:
        for (int i = 0; i < 2; i++) {
            System.out.println("Thông tin department thứ " + (i +1) + " là:");
            System.out.println("ID: " + departments1[i].id);
            System.out.println("Name: " + departments1[i].name);
        }
        System.out.println();

//        Question13:
        Account[] accounts2 = {account1, account2, account3};
        for (int i = 0; i < accounts2.length; i++) {
            if (i != 1) {
                System.out.println("Thông tin account thứ " + (i + 1) + " là:");
                System.out.println("Email: " + accounts2[i].email);
                System.out.println("Full name: " + accounts2[i].fullName);
                System.out.println("Phòng ban: " + accounts2[i].department.name);
            }
        }
        System.out.println();

//        Question14:
        Account[] accounts3 = {account1, account2, account3};
        for (int i = 0; i < accounts2.length; i++) {
            if (accounts3[i].id < 4) {
                System.out.println("Thông tin account thứ " + (i + 1) + " là:");
                System.out.println("Email: " + accounts3[i].email);
                System.out.println("Full name: " + accounts3[i].fullName);
                System.out.println("Phòng ban: " + accounts3[i].department.name);
            }
        }
        System.out.println();

//        Question15:
        for (int i = 2; i <= 20; i+=2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

//        Question16 - ( lam lai cau 10 bang WHILE)
        Account[] accounts4 = {account1, account2};
        int i = 0;
        while (i < accounts4.length) {
            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + accounts4[i].email);
            System.out.println("Full name: " + accounts4[i].fullName);
            System.out.println("Phòng ban: " + accounts4[i].department.name);
            i++;
        }
        System.out.println();

//        Question16 - ( lam lai cau 11 bang WHILE)
        Department[] departments2 = {department1,department2,department3};
        int y = 0;
        while (y < departments2.length) {
            System.out.println("Thông tin department thứ " + (y + 1) + " là:");
            System.out.println("ID: " + departments2[y].id);
            System.out.println("Name: " + departments2[y].name);
            y++;
        }
        System.out.println();

//        Question16 - ( lam lai cau 12 bang WHILE)
        Department[] departments3 = {department1,department2,department3};
        int o = 0;
        while (o < 2) {
            System.out.println("Thông tin department thứ " + (o + 1) + " là:");
            System.out.println("ID: " + departments2[o].id);
            System.out.println("Name: " + departments2[o].name);
            o++;
        }
        System.out.println();

//        Question16 - ( lam lai cau 13 bang WHILE)
        Account[] accounts5 = {account1,account2,account3};
        int p = 0;
        while (p < accounts5.length) {
            if (p != 1) {
                System.out.println("Thông tin account thứ " + (p + 1) + " là:");
                System.out.println("Email: " + accounts5[p].email);
                System.out.println("Full name: " + accounts5[p].fullName);
                System.out.println("Phòng ban: " + accounts5[p].department.name);
            }
            p++;
        }
        System.out.println();

//        Question16 - ( lam lai cau 14 bang WHILE)
        Account[] accounts6 = {account1,account2,account3};
        int i1 = 0;
        while (i1 < accounts6.length) {
            if (accounts6[i1].id < 4) {
                System.out.println("Thông tin account thứ " + (i1 + 1) + " là:");
                System.out.println("Email: " + accounts6[i1].email);
                System.out.println("Full name: " + accounts6[i1].fullName);
                System.out.println("Phòng ban: " + accounts6[i1].department.name);
            }
            i1++;
        }
        System.out.println();

//        Question16 - (lam lai cau 15 bang WHILE)
        int i2 = 2;
        while (i2 <= 20) {
            System.out.print(i2 + " ");
            i2+=2;
        }
        System.out.println();
        System.out.println();

//        Question17 - (lam lai cau 10 bang DO-WHILE)
        Account[] accounts7 = {account1,account2,account3};
        int i3 = 0;
        do {
            System.out.println("Thông tin account thứ " + (i3 + 1) + " là:");
            System.out.println("Email: " + accounts7[i3].email);
            System.out.println("Full name: " + accounts7[i3].fullName);
            System.out.println("Phòng ban: " + accounts7[i3].department.name);
            i3++;
        } while (i3 < accounts7.length);
        System.out.println();

//        Question17 - (lam lai cau 13 bang DO-WHILE)
        Account[] accounts8 = {account1,account2,account3};
        int i4 = 0;
        do {
            if (i4 != 1) {
                System.out.println("Thông tin account thứ " + (i4 + 1) + " là:");
                System.out.println("Email: " + accounts8[i4].email);
                System.out.println("Full name: " + accounts8[i4].fullName);
                System.out.println("Phòng ban: " + accounts8[i4].department.name);
            }
            i4++;
        } while (i4 < accounts8.length);
    }
}

