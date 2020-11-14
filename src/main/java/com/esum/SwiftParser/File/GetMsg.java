package com.esum.SwiftParser.File;

import java.io.File;

public class GetMsg {

    public GetMsg(File file, String path){
        file = new File(path);
    }


    //전체 파일 리스트를 가져온다.
    File[] getFileList(File swiftFile){
        File MsgList[] = swiftFile.listFiles();
        return MsgList;
    }

    /*
    * 스위프트 파일을 가져와서 string으로 변경
    * 이때 데이터는 델리미터단위"\n"로 쪼개지기 때문에 리턴값은 배열형이 된다.
    * */
    String[] getFile(File swiftFile){
        String [] Msgdata = null;


        return Msgdata;
    }

}
