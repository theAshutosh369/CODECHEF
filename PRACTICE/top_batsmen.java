package CODECHEF.PRACTICE;
// Ashutosh top_batsmenirajdar

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

public class top_batsmen {
    static Scanner s = new Scanner(System.in);

    static int fact( int i  )
    {
        if( i==1 ) return 1;
        else return i*fact(i-1);
    }
    static void AshutoshKaUniqueAnswer () {
        int arr[] = new int[11];
        for (int i = 0; i < 11; i++) {
            arr[i] = s.nextInt();
        }
        int k = s.nextInt();
        Arrays.sort( arr );

        if( arr[11-k]==arr[11-k-1] && k<=10 ) {

            int t = arr[11-k];
            int n= 0 , r= 0;
            for (int i = 0; i < 11; i++) {
                if( arr[i]==t ) n++;
            }
            for (int i = 10; i>=11-k; i--) {
                if( arr[i]==t ) r++;
            }
            System.out.println( fact(n) / ( fact(r) * fact( n-r)) );

        }
        else System.out.println(1);


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

