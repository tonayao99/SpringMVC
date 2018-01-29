package com.baidu.zl.DesignPattern.dutychain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DutyChainMode {

    //管理人员抽象类
    public abstract class Manager {
        protected String name;
        protected Manager superior;

        public Manager(String name, Manager superior) {
            this(name);
            this.superior = superior;
        }

        public Manager(String name) {
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setSuperior(Manager superior) {
            this.superior = superior;
        }

        public Manager getSuperior() {
            return superior;
        }

        public abstract void handleApplicationRequest(String content, double limit);

        public abstract String getHanldeObject();
    }

    //部门经理
    public class DepartmentManager extends Manager {
        public DepartmentManager(String name) {
            super(name);
        }

        public void handleApplicationRequest(String content, double limit) {
            if (content.equals("加薪")) {
                superior.handleApplicationRequest(content, limit);
            }
        }

        public String getHanldeObject() {
            return "部门经理";
        }
    }

    //总监
    public class Majordomo extends Manager {
        public Majordomo(String name) {
            super(name);
        }

        public void handleApplicationRequest(String content, double limit) {
            if (content.equals("加薪") && Math.floor(limit) < 100) {
                System.out.println(
                        getHanldeObject() + "已经加薪申请。处理时间" + new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
            } else if (content.equals("加薪") && Math.floor(limit) > 100) {
                superior.handleApplicationRequest(content, limit);
            }
        }

        public String getHanldeObject() {
            return "总监";
        }
    }

    //总经理
    public class GeneralManager extends Manager {
        public GeneralManager(String name) {
            super(name);
        }

        public void handleApplicationRequest(String content, double limit) {
            if (content.equals("加薪")) {
                System.out.println(
                        getHanldeObject() + "已经加薪申请。处理时间" + new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
            }
        }

        @Override
        public String getHanldeObject() {
            return "总经理";
        }
    }

    //申请人
    public class Applicant {
        private String name;
        private String content;
        private Manager manager;

        public Applicant(String name) {
            this.name = name;
        }

        public Applicant(String name, Manager manager) {
            this(name);
            this.manager = manager;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getContent() {
            return content;
        }

        public void setManager(Manager manager) {
            this.manager = manager;
        }

        public Manager getManager() {
            return manager;
        }

        public void submitApplicationRequest(String content, double limit) {
            manager.handleApplicationRequest(content, limit);
        }

    }

    public static void main(String[] args) {
        DutyChainMode dm = new DutyChainMode();

        Applicant xiaozhang = dm.new Applicant("小张");
        Manager departmentManager = dm.new DepartmentManager("经理");
        Manager majordomo = dm.new Majordomo("总监");
        Manager genralManager = dm.new GeneralManager("总经理");

        departmentManager.setSuperior(majordomo);
        majordomo.setSuperior(genralManager);

        xiaozhang.setManager(departmentManager);
        xiaozhang.submitApplicationRequest("加薪", 50);

    }
}
