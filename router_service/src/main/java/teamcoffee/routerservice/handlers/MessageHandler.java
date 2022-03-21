package teamcoffee.routerservice.handlers;


import org.telegram.telegrambots.meta.api.methods.send.SendMessage;


public class MessageHandler {

    private SendMessage sm = new SendMessage();

    public static SendMessage messageHandle(String role, Long chat_id, String message) {
        SendMessage sendMessage = new SendMessage();
        if (role.equalsIgnoreCase("User")) {
             return sendMessage = new MessageHandler().userRole(chat_id, message);
        } else if (role.equalsIgnoreCase("Admin")) {
            return sendMessage = new MessageHandler().adminRole(chat_id, message);
        } else if (role.equalsIgnoreCase("Lector")) {
            return sendMessage = new MessageHandler().lectorRole(chat_id, message);
        } else if (role.equalsIgnoreCase("TeamLead")) {
            return sendMessage = new MessageHandler().teamLeadRole(chat_id, message);
        }
        return SendMessage.builder().chatId(chat_id.toString()).text("Извините, но Вас нету с писке наших сотрудников " +
                "обратитесь к Администрации бота").build();
    }

    private SendMessage userRole(Long chat_id, String message) {
        UserMessageSender usm = new UserMessageSender();
        if (message.equalsIgnoreCase("/start")) {
            return sm = usm.startMessage(chat_id, message);
        } else if (message.equalsIgnoreCase("/viewprofile")) {
            return sm = usm.viewUserProfile(chat_id, message);
        } else if (message.equalsIgnoreCase("/editusername")) {
            return sm = usm.editUserName(chat_id, message);
        } else if (message.equalsIgnoreCase("/editusersurname")) {
            return sm = usm.editUserSurName(chat_id, message);
        } else if (message.equalsIgnoreCase("/starttracking")) {
            return sm = usm.startTracking(chat_id, message);
        } else if (message.equalsIgnoreCase("/taskname")) {
            return sm = usm.taskName(chat_id, message);
        } else if (message.equalsIgnoreCase("/stoptracking")) {
            return sm = usm.stopTracking(chat_id, message);
        } else if (message.equalsIgnoreCase("/help")) {
            return sm = usm.helpCommand(chat_id, message);
        }
        return SendMessage.builder().chatId(chat_id.toString()).text("Некорректная команда").build();
    }

    private SendMessage adminRole(Long chat_id, String message) {
        AdminMessageSender ams = new AdminMessageSender();
        if (message.equalsIgnoreCase("/start")) {
            return sm = ams.startMessage(chat_id, message);
        } else if (message.equalsIgnoreCase("/viewprofile")) {
            return sm = ams.viewUserProfile(chat_id, message);
        } else if (message.equalsIgnoreCase("/editusername")) {
            return sm = ams.editUserName(chat_id, message);
        } else if (message.equalsIgnoreCase("/editusersurname")) {
            return sm = ams.editUserSurName(chat_id, message);
        } else if (message.equalsIgnoreCase("/createuser")) {
            return sm = ams.createUser(chat_id, message);
        } else if (message.equalsIgnoreCase("/edituser")) {
            return sm = ams.editUser(chat_id, message);
        } else if (message.equalsIgnoreCase("/deleteuser")) {
            return sm = ams.deleteUser(chat_id, message);
        } else if (message.equalsIgnoreCase("/assigngroupuser")) {
            return sm = ams.assignGroupUser(chat_id, message);
        } else if (message.equalsIgnoreCase("/creategroup")) {
            return sm = ams.createGroup(chat_id, message);
        } else if (message.equalsIgnoreCase("/editgroup")) {
            return sm = ams.editGroup(chat_id, message);
        } else if (message.equalsIgnoreCase("/deletegroup")) {
            return sm = ams.deleteGroup(chat_id, message);
        } else if (message.equalsIgnoreCase("/createsettingsreport")) {
            return sm = ams.createSettingsReport(chat_id, message);
        } else if (message.equalsIgnoreCase("/editsettingsreport")) {
            return sm = ams.editSettingsReport(chat_id, message);
        } else if (message.equalsIgnoreCase("/deletesettingsreport")) {
            return sm = ams.editSettingsReport(chat_id, message);
        } else if (message.equalsIgnoreCase("/getalluserswithgroupname")) {
            return sm = ams.getAllUsersWithGroupName(chat_id, message);
        } else if (message.equalsIgnoreCase("/getallgroups")) {
            return sm = ams.getAllGroups(chat_id, message);
        } else if (message.equalsIgnoreCase("/getgroupusers")) {
            return sm = ams.getGroupUsers(chat_id, message);
        } else if (message.equalsIgnoreCase("/help")) {
            return sm = ams.helpCommand(chat_id, message);
        }
        return SendMessage.builder().chatId(chat_id.toString()).text("Некорректная команда").build();
    }

    private SendMessage teamLeadRole(Long chat_id, String message) {
        TeamLeadMessageSender tlms = new TeamLeadMessageSender();
        if (message.equalsIgnoreCase("/start")) {
            return sm = tlms.startMessage(chat_id, message);
        } else if (message.equalsIgnoreCase("/viewprofile")) {
            return sm = tlms.viewUserProfile(chat_id, message);
        } else if (message.equalsIgnoreCase("/editusername")) {
            return sm = tlms.editUserName(chat_id, message);
        } else if (message.equalsIgnoreCase("/editusersurname")) {
            return sm = tlms.editUserSurName(chat_id, message);
        } else if (message.equalsIgnoreCase("/getalluserswithgroupname")) {
            return sm = tlms.getAllUsersWithGroupName(chat_id, message);
        } else if (message.equalsIgnoreCase("/getallgroups")) {
            return sm = tlms.getAllGroups(chat_id, message);
        } else if (message.equalsIgnoreCase("/getgroupusers")) {
            return sm = tlms.getGroupUsers(chat_id, message);
        } else if (message.equalsIgnoreCase("/starttracking")) {
            return sm = tlms.startTracking(chat_id, message);
        } else if (message.equalsIgnoreCase("/taskname")) {
            return sm = tlms.taskName(chat_id, message);
        } else if (message.equalsIgnoreCase("/stoptracking")) {
            return sm = tlms.stopTracking(chat_id, message);
        } else if (message.equalsIgnoreCase("/help")) {
            return sm = tlms.helpCommand(chat_id, message);
        }
        return SendMessage.builder().chatId(chat_id.toString()).text("Некорректная команда").build();
    }

    private SendMessage lectorRole(Long chat_id, String message) {
        LectorMessageSender lms = new LectorMessageSender();
        if (message.equalsIgnoreCase("/start")) {
            return sm = lms.startMessage(chat_id, message);
        } else if (message.equalsIgnoreCase("/getalluserswithgroupname")) {
            return sm = lms.getAllUsersWithGroupName(chat_id, message);
        } else if (message.equalsIgnoreCase("/getallgroups")) {
            return sm = lms.getAllGroups(chat_id, message);
        } else if (message.equalsIgnoreCase("/getgroupusers")) {
            return sm = lms.getGroupUsers(chat_id, message);
        } else if (message.equalsIgnoreCase("/help")) {
            return sm = lms.helpCommand(chat_id, message);
        }
        return SendMessage.builder().chatId(chat_id.toString()).text("Некорректная команда").build();
    }

}


