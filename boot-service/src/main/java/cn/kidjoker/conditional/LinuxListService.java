package cn.kidjoker.conditional;

public class LinuxListService implements ListService {

    @Override
    public String showListCmd() {
        return "ls";
    }

}
