package birthday;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author r-takahashi
 */
public class NewClass {
    public static void main(String[] args) throws IOException
    {
        // TODO code application logic here
        int yyyy = 0;   //入力した年
        int mm = 0;     //入力した月
        int dd = 0;     //入力した日
        boolean er = true;
        int dw = 0;     // 曜日
        int[] Month = new int[13];
        Month[0] = 0;
        Month[1] = 31;
        Month[2] = 28;
        Month[3] = 31;        
        Month[4] = 30;        
        Month[5] = 31;        
        Month[6] = 30;        
        Month[7] = 31;        
        Month[8] = 31;        
        Month[9] = 30;        
        Month[10] = 31;        
        Month[11] = 30;        
        Month[12] = 31;   
        
        String[] dwl = new String[8];
        dwl[0] = "";
        dwl[1] = "日";
        dwl[2] = "月";
        dwl[3] = "火";
        dwl[4] = "水";
        dwl[5] = "木";
        dwl[6] = "金";
        dwl[7] = "土";
               
        while(true){
            /* 1.誕生日の入力、曜日の予想を入力 */
            //入力を促すメッセージの表示
            System.out.println("誕生日を入力してください。 入力例 : 2017/4/27　（終了する場合はFかfを押してEnter）");
           // 最初に戻るループを起こすためにerを変える。
            er = true;  
            while(er == true){
                //誕生日の入力を促す    
                BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
                String str1 = br1.readLine();   // "yyyy/mm/dd"を入力
                // エラーチェック
                int len = str1.length();
                if(len == 0){
                    System.out.println("入力例に従って、正しく入力してください。");
                    System.out.println("もう一度誕生日を入力して下さい。 入力例 : 2017/4/27（終了する場合はFかfを押してEnter）");
                    continue;
                }
                // 終了指示
                char ch1 = str1.charAt(0);
                if(ch1 == 'F'|| ch1 == 'f'){
                    System.exit(0);
                }
                // 値の正誤                
                try{
                int idx = 0;
                idx = str1.indexOf('/');
                yyyy = Integer.parseInt(str1.substring(0, idx));    // yyyyまでの文字列を返す
                String str2 = str1.substring(idx+1);    // mm/ddを返す
                
                idx = str2.indexOf('/');
                mm = Integer.parseInt(str2.substring(0, idx));  // mmまでの値を返す
                String str3 = str2.substring(idx+1);    // ddを返す
                
                dd = Integer.parseInt(str3);
                }
                catch(NumberFormatException e){
                    System.out.println("入力例に従って、正しく入力してください。");
                    System.out.println("もう一度誕生日を入力して下さい。 入力例 : 2017/4/27（終了する場合はFかfを押してEnter）");
                    continue;
                }
                catch(StringIndexOutOfBoundsException e){
                    System.out.println("入力例に従って、正しく入力してください。");
                    System.out.println("もう一度誕生日を入力して下さい。 入力例 : 2017/4/27（終了する場合はFかfを押してEnter）");
                    continue;
                }
                
                er = false; //  エラーチェック入れる 
                if(!(yyyy >= 1 && yyyy <= 5000)){
                    er = true;
                    System.out.println("入力例に従って、正しく入力してください。");
                    System.out.println("もう一度誕生日を入力して下さい。 入力例 : 2017/4/27（終了する場合はFかfを押してEnter）");
                    continue;
                }
                if(!(mm >= 1 && mm <= 12)){
                    er = true;
                    System.out.println("入力例に従って、正しく入力してください。");
                    System.out.println("もう一度誕生日を入力して下さい。 入力例 : 2017/4/27（終了する場合はFかfを押してEnter）");
                    continue;
                }
                if(!(dd >= 1 && dd <= Month[mm])){
                    er = true;
                    if((yyyy % 4 == 0 && yyyy % 100 !=0 )||
                                    (yyyy % 4 == 0 && yyyy % 100 == 0 && yyyy % 400 == 0)
                                        && (mm == 2 && dd == 29)){
                                er = false;
                    }
                    else{
                        System.out.println("入力例に従って、正しく入力してください。");
                        System.out.println("もう一度誕生日を入力して下さい。 入力例 : 2017/4/27（終了する場合はFかfを押してEnter）");
                    }
                }
            }
            er = true;
            //入力を促すメッセージの表示
                System.out.println("誕生日の曜日を予想してください。 入力例 : 月 （終了する場合はFかfを押してEnter）");
            while(er == true){
                //曜日の予想
                BufferedReader br2 =
                new BufferedReader(new InputStreamReader(System.in, "Shift_JIS"));

                String str4 = br2.readLine();
                // エラーチェック
                int len = str4.length();
                if(len == 0){
                    System.out.println("入力例に従って、正しく入力してください。");
                    System.out.println("もう一度誕生日の曜日を入力して下さい。 入力例 : 月（終了する場合はFかfを押してEnter）");
                    continue;
                }
                
                char ch2 = str4.charAt(0);
                if(ch2 == 'F'|| ch2 == 'f'){
                    System.exit(0);
                }                  
                
                er = false;
                switch(ch2){
                    case '日':
                        dw = 1;
                        break;
                    case '月':
                        dw = 2;
                        break;
                    case '火':
                        dw = 3;
                        break;
                    case '水':
                        dw = 4;
                        break;
                    case '木':
                        dw = 5;
                        break;
                    case '金':
                        dw = 6;
                        break;
                    case '土':
                        dw = 7;
                        break;
                    default:
                        er = true;
                        System.out.println("入力例に従って、正しく入力してください。");
                        System.out.println("もう一度、誕生日の曜日を予想してください。 入力例 : 月 （終了する場合はFかfを押してEnter）");
                }    
            }
            
            /* ２.入力された日付から曜日を求める */
            int yyyyc = 2017;
            int mmc = 1;
            int ddc = 1;
            int dwc = 1;
            // 曜日計算
            while((yyyy != yyyyc) || (mm != mmc) || (dd != ddc)){
                if( yyyy >= 2017){     // 2017年以降の処理　++
                    // 曜日++
                    dwc++;
                    if(dwc == 8){
                        dwc = 1;
                    }
                    //日付++
                    ddc++;
                   // 日付の判定
                    if( ddc > Month[mmc]){
                        ddc = 1;                       
                        mmc++;
                        if( mmc > 12){
                            mmc = 1;
                            yyyyc++;
                            // うるう年の判定
                            if((yyyyc % 4 == 0 && yyyyc % 100 !=0 )||
                                    (yyyyc % 4 == 0 && yyyyc % 100 == 0 && yyyyc % 400 == 0)){
                                Month[2] = 29;
                            }
                            else{
                                Month[2] = 28;
                            }
                        }
                    }
                }

                else{       // 2016年以前の処理　--
                    // 曜日--
                    dwc--;
                    if(dwc < 1){
                        dwc = 7;
                    }
                    // 日付--
                    ddc--;
                    // 日付の判定
                    if(ddc < 1){
                        mmc--;
                        if(mmc < 1){
                            mmc = 12;
                            yyyyc--;
                            // うるう年の判定
                            if((yyyyc % 4 == 0 && yyyyc % 100 !=0 )||
                                    (yyyyc % 4 == 0 && yyyyc % 100 == 0 && yyyyc % 400 == 0)){
                                Month[2] = 29;
                            }
                            else{
                                Month[2] = 28;
                            }

                        }
                        ddc = Month[mmc];
                    }
                }
            }
     
            /* ３.メッセージを表示 */                     
            // ユーザーの予想と比較
            if(dw == dwc){
                System.out.println("正解です、よく何曜日に生まれたか知っていますね。 ");
            }
            else if((dwc - dw == 1) || (dwc - dw == -1) ||(dwc - dw == 6) || (dwc - dw == -6)){
                System.out.println("惜しい、あなたの生まれたのは" + dwl[dwc] + "曜日ですよ。 ");
            }
            else{
                System.out.println("残念ですが、あなたの生まれた日は" + dwl[dwc] + "曜日です。 ");
            }
        }
    }
}
