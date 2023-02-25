package CODECHEF.PRACTICE;
// Ashutosh football_matchirajdar

/*
                                   || कृष्ण सदा सहायते ||

                       `//:-`                                          `````      `
    `                  -+/:++/-`                                       ```      `
                    ```/+/::/+++:```` ``                              `                  ````
                `..-.`./o:o::/+/o-     `...`                       `        `          ````
             `.-..````-o+/o//yhyoo.      ```..`                         ````          ` `
    `      `...````` `./++/+sMNdso.```   ``````.`                     ```
      `   `.`````   .///oo+//sooo+.++:/:`````````.`                  ````             ``````
       `.````       /+o+/oooosooyoo+////++.````````.`               ```               ``        ```
      ````          -oo+++++/o+//+o++o/+ooo- ```````..                                       ````
     ``             //s//-:ooso:/+/yss+shos+` ```````.-                                     ````
    .`             .++s++//+//y+//+sossooo+++`     ` ``.            `...-.                ``
   ..          `./+s+oss++.:+/o+////o/:-//::/o`        ``      .:-::/:. /`      ```
  `-`        `.+o+/ysoy/:+/:/:/:+/:+/--` `:`:.:         `  .-/o:o:-. ``..                 `
  -`        .++-/ooy++oso/::.--/s+y+-     `/.-`:        .:oyss/.:   ```-                 `
  -``      -+::/+-/+sssso-:.://+/oo: `:+sys:://s.     ./+:y++s.-`   .`/    `          ``
  -``    `-+--++/++s+oso////+////++/.:.:/+ss:-+ys`   :+/:-+-.:``-   `:.  `         ``
 `.``    `+/-/+/++oy:++oo+o/::/:/+:/` :o+shs/../o-  //+:-.--``` :`  ./            ` `
 `-.`    -o://+-.-:s::o+oo+::/o++:o/``---.````  `.::o.s:--`..`  `- ./`           ``
  -``   `:+-:////++ss/oo++o/++++sd/-.`        --//oss:/+---.```  :.-             ` ``
  -.``   :+-/:///:::oy/++os+++osyNo+/.``      `.-osyyo-+/-----://s-             ````
  `-``   `o/-/+-.-:+oyo/+ooo+.+y+hdds:...`    `:+osoo+o/o+oss+//o++          ````
   ..``   :+.:///++/:/y+:sooo//+/:/+/:--.`     `-// ``-`++ss+-:-+:-:       ```
    -.``  .//-://+-.-oso/oo+o+oo/+/-::--.``       .` ` `+/+o/.:-:-/+`     `           ``
    `-``   .:+`./+/++o-o+:oossyhNmo::::--..````.--/..` :-:oo///:/++:/
  `   .``   `oo:--:/++:so/syhhmshyyy/::--:--:+so:-.-   o+oo///::-:+os:
        ``    :oo../ohmmmdddmmmmdhs::----:/+o+o``-.   -s/:.        `.+
        ```    `ohmNNmhs++++:-/+oss/..` ```.-+.`.     ++:-..`        :`       ``           `
       `` `-. `odMMdhyyso+:.:+/+ooo+ssosooossyso++-.-/o/:-...``       -      ``            `
      `     `.oNMMhosssso++///osoo+-:ssso+yho+/+++++o++:----.....`    :
             -mMMy/oossss//+sooo+-.`+/++s+:/o:++ooooo+///:....`       .-
          `-/hMMm+oo+o+sossooo//:-..+o+os+://+++ooo+oo+/:::-.````      :                `
        -shmmMMMhssoyssssyso+:/:-:`::/+syo+soo++o/:/:+/---...-.`       .             ``
      `+ddmMMMMMmsoossooo+////+/:-.:::-/o+oss/:-/:`-::::``    ``       :             `
      -+mmNMMMMMNo+//++//////++:/-::/:-+o::+s/../:..-`.:-             -`
    ``/oNNMMMMMMN+//+++//++//////::/--:os++oo.``/:``+.  .-`         `:`
   ``-oomMMMMNNMm/:/+/+//+/::///////:--+so+oo`  :/ `::   `      ` `.-`
   ``.-::ddNNNNMm/-/+:o++/::/::::::/::-:+ysoo-  `:---.`` ``.-::--.-`
        .:o/ydmmd/-+//o+///+++/++/+/:/:/oyyss++o++os+os://o/+`
        ...`o:sdm::+:/+++ooo++osyyyy+y///yo+ysoo/oys+so+o+//:o                   ``
         ` `/.-hy+:/+/++//:/:://syss/so++ys+oyoo+soy/ys:o+///::        ````````````````
              `:-+-://::::/-///:ooyoo-:-`hyo/o+++++/osy/o/+o::
         ``    ``-+:/:::::::::::+oyo+..`.sy+/.-/o+--oohy++::+.
                  o:-////:---:-./oo++.`.`oy+o``.s+:-s+so/:.`-.        ````
      `           -+-///::-:::-.:+o+/-.``os/o `-os:-ooso:/.``-       ```````````  `````
     `            `+-::-::-----.:+s+/...`+o/o`` ...-soo+:/``.-      ` ````` `````````````````
                   -+::::-.-..---+y//-..`:s++/`  `.++sy/::``:.     ` `.-.````````
                   .o:-:.--.--:--oos/+////o+o+/--://:sy///:-/:     ````...```    `
     ``````        .+--..-------:/ss/s//+:o+://o++/++oyoo/+/+o.      `````              `
 ```````````       `+:.---::-.-.-/ys+++o++oo+/oooy+s+yys+/+//-:.     `` `
   ` ``             +.-.-::-.--`:/os++o-o/ooo++/++++ossy/oo//:`-.  ```` ``````` ` ``````````` `
                    +....:-.--..-/+y/+:/:::-/oooosoo+sy+s///+...:.      ```````````````````````
                    -/`--...-....//s/:-.-./``..///+::oy:+//-/`  `:.
*/

import java.util.*;

public class football_match {
    static Scanner s = new Scanner(System.in);

    static void AshutoshKaUniqueAnswer ()
    {
        int n = s.nextInt();
        if( n==0 ) {
            System.out.println( "Draw");
            return;
        }
        Map<String , Integer> mp = new HashMap<>();
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String str =  s.next();
            if( !arr.contains(str) ) arr.add( str );
            mp.put( str , mp.getOrDefault( str , 0 )+1  );
        }



        int a = mp.get( arr.get(0) );
        int b = mp.get( arr.get(1) );
        if( a>b ) System.out.println( arr.get(0) );
        else if( b>a ) System.out.println( arr.get(1));
        else System.out.println( "Draw");
    }

    public static void main ( String[] args ) {

        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            AshutoshKaUniqueAnswer();
        }
        s.close();
        //-------------------------------------------
    }
}

