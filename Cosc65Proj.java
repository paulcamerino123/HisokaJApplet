/*
 * Subject requirement project for COSC65
 * Create an attempt to copy an image using JApplet
 * Image chosen from the animation Hunter x Hunter
 * Character: Hisoka
 */

import javax.swing.JApplet;
import java.awt.*;

public class Cosc65Proj extends JApplet{
    public void paint(Graphics g){
        
    /***************HEAD OUTLINE********/
    int [] head_x = {
        103,104,114,126,143,149,147,143,144,159,
        192,238,254,263,273,287,309,342,351,375,
        387,405,431,455,473,489,507,535,557,583,
        596,604,614,618,629,639,643,646,660,672,
        694,706,707,703,713,719,734,736,740
    };
    int [] head_y = {
        0,9,21,34,54,69,91,115,120,142,
        172,248,328,365,403,427,458,496,507,533,
        548,562,570,566,548,528,507,475,446,409,
        366,324,274,247,232,207,184,178,176,162,
        133,113,106,97,60,43,22,7,0
    };
    g.setColor(Color.BLACK); /************BLACK*****************/
    g.drawPolyline(head_x, head_y, head_x.length);

    /*************RED HEAD********************/
    int [] redHead_x = {
        102,106,126,143,150,150,146,166,183,192,
        199,208,234,239,236,240,249,253,255,259,
        263,278,308,333,392,407,433,477,516,553,
        575,590,604,606,609,617,620,619,640,643,
        643,655,663,671,681,706,707,704,705,714,
        712,730,735,739
    };
    int [] redHead_y = {
        0,17,31,54,70,93,119,148,159,176,
        172,176,244,250,215,200,171,149,145,106,
        96,72,68,74,97,101,101,90,82,76,
        77,86,128,174,185,208,233,248,208,190,
        184,176,174,159,153,114,107,102,85,53,
        49,25,17,0
    };
    g.setColor(Color.RED);/********RED*******/
    g.fillPolygon(redHead_x, redHead_y, redHead_x.length);
    g.setColor(Color.BLACK); /************BLACK*****************/
    
    /**************ABOMINABLE HAIR FOLICLES************************/
    int [] hair_x = {
        199,192,178,167,157
    };
    int [] hair_y = {
        172,161,151,142,127
    };
    g.drawPolyline(hair_x, hair_y, hair_x.length);

    int [] hair1_x = {
        207,205,193,181,171,169,173,171,158,146,
        134,
    };
    int [] hair1_y = {
        172,157,142,118,88,74,64,50,34,20,
        0
    };
    g.drawPolyline(hair1_x, hair1_y, hair1_x.length);

    int [] hair2_x = {
        235,225,217,217
    };
    int [] hair2_y = {
        218,195,174,165
    };
    g.drawPolyline(hair2_x, hair2_y, hair2_x.length);

    int [] hair3_x = {
        236,222,220,201,188,187,189,185,174,164
    };
    int [] hair3_y = {
        207,174,148,116,87,68,50,30,16,0
    };
    g.drawPolyline(hair3_x, hair3_y, hair3_x.length);

    int [] hair4_x = {
        248,236,228
    };
    int [] hair4_y = {
        172,148,128
    };
    g.drawPolyline(hair4_x, hair4_y, hair4_x.length);

    int [] hair5_x = {
        251,240,228,211,212,208,196,191
    };
    int [] hair5_y = {
        159,131,118,80,39,28,14,0
    };
    g.drawPolyline(hair5_x, hair5_y, hair5_x.length);

    int [] hair6_x = {
        255,244,238,234,231,229,229,227
    };
    int [] hair6_y = {
        102,88,72,60,41,25,11,0
    };
    g.drawPolyline(hair6_x, hair6_y, hair6_x.length);

    int [] hair7_x = {
        282,270,263,257,252,259,267
    };
    int [] hair7_y = {
        67,49,32,16,0,9,22
    };
    g.drawPolyline(hair7_x, hair7_y, hair7_x.length);

    int [] hair8_x = {
        317,312,308,298,289,283
    };
    int [] hair8_y = {
        67,50,41,28,14,0
    };
    g.drawPolyline(hair8_x, hair8_y, hair8_x.length);

    int [] hair9_x = {
        343,337,331,321,313,301
    };
    int [] hair9_y = {
        74,65,56,42,26,10
    };
    g.drawPolyline(hair9_x, hair9_y, hair9_x.length);

    int [] hair10_x = {
        389,382,375,370,366,363,362
    };
    int [] hair10_y = {
        95,82,67,56,32,16,0
    };
    g.drawPolyline(hair10_x, hair10_y, hair10_x.length);

    int [] hair11_x = {
        419,411,402,399,393,387
    };
    int [] hair11_y = {
        100,87,72,58,42,11
    };
    g.drawPolyline(hair11_x, hair11_y, hair11_x.length);

    int [] hair12_x = {
        430,425,415
    };
    int [] hair12_y = {
        100,92,75
    };
    g.drawPolyline(hair12_x, hair12_y, hair12_x.length);

    int [] hair13_x = {
        477,483,488,493,494,494
    };
    int [] hair13_y = {
        88,73,57,34,24,0
    };
    g.drawPolyline(hair13_x, hair13_y, hair13_x.length);

    int [] hair14_x = {
        498,498
    };
    int [] hair14_y = {
        0,19
    };
    g.drawPolyline(hair14_x, hair14_y, hair14_x.length);

    int [] hair15_x = {
        488,494,501,505,508
    };
    int [] hair15_y = {
        86,71,55,47,31
    };
    g.drawPolyline(hair15_x, hair15_y, hair15_x.length);

    int [] hair16_x = {
        518,525,530,537
    };
    int [] hair16_y = {
        79,62,49,26
    };
    g.drawPolyline(hair16_x, hair16_y, hair16_x.length);

    int [] hair17_x = {
        537,541,549,554,560,564,565
    };
    int [] hair17_y = {
        67,51,32,20,10,6,0
    };
    g.drawPolyline(hair17_x, hair17_y, hair17_x.length);

    int [] hair18_x = {
        540,548,561,569,575,580,582
    };
    int [] hair18_y = {
        71,59,44,31,19,7,0
    };
    g.drawPolyline(hair18_x, hair18_y, hair18_x.length);

    int [] hair19_x = {
        575,583,594,606,619,630,634,634
    };
    int [] hair19_y = {
        75,61,48,37,22,9,4,0
    };
    g.drawPolyline(hair19_x, hair19_y, hair19_x.length);

    int [] hair20_x = {
        595,607,619,625,634,643,649,650
    };
    int [] hair20_y = {
        92,79,64,55,39,21,9,0
    };
    g.drawPolyline(hair20_x, hair20_y, hair20_x.length);

    int [] hair21_x = {
        604,609,614,622,626,641,653,662,671,679,
        686,689,691
    };
    int [] hair21_y = {
        130,122,116,104,97,84,74,64,50,38,
        27,17,0
    };
    g.drawPolyline(hair21_x, hair21_y, hair21_x.length);

    int [] hair22_x = {
        606,614,622,629,637,650,662,673,679,687
    };
    int [] hair22_y = {
        156,141,127,117,107,94,79,65,50,25
    };
    g.drawPolyline(hair22_x, hair22_y, hair22_x.length);

    int [] hair23_x = {
        608,616,623,627,635,644,654,661,668,671,
        677,678,690,697,703
    };
    int [] hair23_y = {
        179,168,160,156,147,140,130,120,111,104,
        91,89,81,72,59
    };
    g.drawPolyline(hair23_x, hair23_y, hair23_x.length);

    int [] hair24_x = {
        717,710,706,704
    };
    int [] hair24_y = {
        0,11,23,33
    };
    g.drawPolyline(hair24_x, hair24_y, hair24_x.length);

    int [] hair25_x = {
        617,621,625,630,642,652,656,664
    };
    int [] hair25_y = {
        203,190,182,175,162,151,144,130
    };
    g.drawPolyline(hair25_x, hair25_y, hair25_x.length);

    int [] hair26_x = {
        620,624,630,634
    };
    int [] hair26_y = {
        233,224,214,203
    };
    g.drawPolyline(hair26_x, hair26_y, hair26_x.length);

    int [] hair27_x = {
        645,649,654,660,665,677,682,695,703,708,
        712
    };
    int [] hair27_y = {
        180,170,162,150,135,124,118,107,88,63,
        50
    };
    g.drawPolyline(hair27_x, hair27_y, hair27_x.length);

    /********AMATEUR LAZY PATCHWORK********/
    g.setColor(Color.WHITE);
    int [] lazy_x = {
        192,238
    };
    int [] lazy_y = {
        172,248
    };
    g.drawPolyline(lazy_x, lazy_y, lazy_x.length);
    g.setColor(Color.BLACK); /***************BLACK*****************/

    /*************LEFT EAR OUTLINE*******/
    int [] earL_x = { 
        239,236,232,222,213,208,203,191,176,175,
        179,180,184,211,224,233,256
    };
    int [] earL_y = {
        251,247,241,220,193,177,174,174,188,203,
        223,265,273,304,324,342,349
    };
    g.drawPolyline(earL_x, earL_y, earL_x.length);

    /**************LEFT EAR*********************/
    int [] lEar_x = {
        187,185,190,195,229,232,233,243,249,249,
        243,231,218,212,206,204,205,215,228
    };
    int [] lEar_y = {
        231,207,199,197,245,253,275,290,296,308,
        307,304,288,281,264,252,241,240,244
    };
    g.drawPolyline(lEar_x, lEar_y, lEar_x.length);

    int [] lEar1_x = {
        247,229,224,203
    };
    int [] lEar1_y = {
        320,311,304,278
    };
    g.drawPolyline(lEar1_x, lEar1_y, lEar1_x.length);

    /*************RIGHT EAR OUTLINE***************/
    int [] earR_x = { 
        601,624,628,632,648,673,679,676,666,645,
        640,629,619
    };
    int [] earR_y = {
        352,344,338,325,302,273,195,186,177,180,
        208,233,244
    };
    g.drawPolyline(earR_x, earR_y, earR_x.length);

    /*************DISGUSTING RIGHT EAR************/
    int [] rEar_x = {
        605,645
    };
    int [] rEar_y = {
        322,285
    };
    g.drawPolyline(rEar_x, rEar_y, rEar_x.length);

    int [] rEar1_x = {
        670,672,669,666,659,652,645,631,627,624,
        624,622,610,608,613,631,641,646,651,649,
        644,637,624
    };
    int [] rEar1_y = {
        229,210,199,196,196,202,218,238,241,250,
        273,280,293,311,309,291,281,271,253,245,
        239,239,250
    };
    g.drawPolyline(rEar1_x, rEar1_y, rEar1_x.length);


    /*****************FOREHEAD LINE*******/
    int [] foreHeadLine_x = {
        239,237,236,239,246,251,253,256,259,263,
        277,305,331,398,413,440,476,533,569,589,
        593,604,608,618,619,618
    };
    int [] foreHeadLine_y = {
        250,226,213,201,184,169,152,138,108,93,
        72,67,74,99,101,99,91,79,75,84,
        88,125,184,205,229,245
    };
    g.drawPolyline(foreHeadLine_x, foreHeadLine_y, foreHeadLine_x.length);

    /********************LEFT EYEBROWSHIT*****************/
    int [] browL_x = {
        255,265,282,304,311,334,366,396,366,341,
        303,283,263
    };
    int [] browL_y = {
        184,170,156,143,146,165,193,229,194,174,
        149,160,175
    };
    g.setColor(Color.RED);/*******RED**********/
    g.fillPolygon(browL_x, browL_y, browL_x.length);

    int [] browL1_x = {
        255,265,282,304,311,334,366,396,366,341,
        303,283,263
    };
    int [] browL1_y = {
        184,170,156,143,146,165,193,229,194,174,
        149,160,175
    };
    g.fillPolygon(browL1_x, browL1_y, browL1_x.length);

    int [] browL2_x = {
        255,265,282,304,311,334,366,396,366,341,
        303,283,263
    };
    int [] browL2_y = {
        184,170,156,143,146,165,193,229,194,174,
        149,160,175
    };
    g.fillPolygon(browL2_x, browL2_y, browL2_x.length);

    /**********RIGHT EYEBROW***************/
    int [] browR_x = {
        469,496,549,560,582,597,608,607,594,583,
        558,553,532,510,492,468
    };
    int [] browR_y = {
        225,193,144,146,163,180,195,196,182,172,
        152,152,165,184,200,225
    };
    g.fillPolygon(browR_x, browR_y, browR_x.length);
    g.setColor(Color.BLACK); /************BLACK*****************/

    /**********LEFT EYELID LINE******************/
    int [] eL_x = {
        304,329,353,370,383
    };
    int [] eL_y = {
        210,211,218,230,246
    };
    g.setColor(Color.BLACK); /*************BLACK*************/
    g.drawPolyline(eL_x, eL_y, eL_x.length);

    /********RIGHT EYELID LINE***************/
    int [] eLR_x = {
        478,495,501,506,536
    };
    int [] eLR_y = {
        243,224,218,217,208
    };
    g.drawPolyline(eLR_x, eLR_y, eLR_x.length);

    /*******LEFT SEXY ASIAN EYE OUTLINE******************/
    int [] lEye_x = {
        381,365,355,338,313,281,271,246,265,272,
        282,298,313
    };
    int [] lEye_y = {
        256,246,248,244,239,228,224,217,227,235,
        247,255,260
    };
    g.drawPolyline(lEye_x, lEye_y, lEye_x.length);

    int [] lEye1_x = {
        341,359,372,383,371,356
    };
    int [] lEye1_y = {
        261,260,261,266,258,248
    };
    g.drawPolyline(lEye1_x, lEye1_y, lEye1_x.length);

    /*********LEFT ATTRACTIVE EYEBAG LINE***/
    int [] ebL_x = {
        270,277,296,310
    };
    int [] ebL_y = {
        246,255,263,266
    };
    g.drawPolyline(ebL_x, ebL_y, ebL_x.length);

    /*********RIGHT SEXY ASIAN EYE OUTLINE**********************/
    int [] rEye_x = {
        476,488,502,521,543,570,585,607,589,581,
        572,558,551,539,
    };
    int [] rEye_y = {
        259,250,247,245,239,233,228,221,232,242,
        250,258,261,261
    };
    g.drawPolyline(rEye_x, rEye_y, rEye_x.length);

    int [] rEye1_x = {
        509,493,482,476,483,494,507
    };
    int [] rEye1_y = {
        263,263,264,267,259,253,248
    };
    g.drawPolyline(rEye1_x, rEye1_y, rEye1_x.length);

    /*******RIGHT ATTRACTIVE EYEBAG LINE**********/
    int [] ebR_x = {
        552,565,575,583
    };
    int [] ebR_y = {
        266,261,255,249
    };
    g.drawPolyline(ebR_x, ebR_y, ebR_x.length);

    /*************HEART-PIERCING LEFT EYEBALL*************************/
    int [] eyeBL_x = {
        318,318,322,330,335,335,333,333,329,324,
        321,320
    };
    int [] eyeBL_y = {
        240,247,253,254,249,244,244,247,251,251,
        247,240
    };
    g.fillPolygon(eyeBL_x, eyeBL_y, eyeBL_x.length);

    int [] irisL_x = {
        325,325,328,331
    };
    int [] irisL_y = {
        242,246,247,243
    };
    g.fillPolygon(irisL_x, irisL_y, irisL_x.length);

    /***************HEART-PIERCING RIGHT EYEBALLL*********************/
    int [] eyeBR_x = {
        520,525,535,542,542,538,538,535,528,525,
        524
    };
    int [] eyeBR_y = {
        245,251,252,246,240,241,245,248,249,247,
        244
    };
    g.fillPolygon(eyeBR_x, eyeBR_y, eyeBR_x.length);

    int [] irisR_x = {
        535,532,530,527
    };
    int [] irisR_y = {
        242,246,246,243
    };
    g.fillPolygon(irisR_x, irisR_y, irisR_x.length);

    /***************DESIRABLE NOSE LINE************************/
    int [] noseLine_x = {
        409,415,413,406,402,398,393,407,415,418,
        418,409
    };
    int [] noseLine_y = {
        251,266,284,320,348,370,386,403,400,273,
        266,251
    };
    g.drawPolyline(noseLine_x, noseLine_y, noseLine_x.length);

    /**********NOSELINE SHADOW*/
    int [] noselineS_x = {
        423,421,418,414,414,417,415,407
    };
    int [] noselineS_y = {
        420,401,264,260,266,269,399,404
    };
    g.fillPolygon(noselineS_x, noselineS_y, noselineS_x.length);

    /****LEWD NOSETRILL*/
    int [] noseTrill_x = {
        446,457
    };
    int [] noseTrill_y = {
        409,402
    };
    g.drawPolyline(noseTrill_x, noseTrill_y, noseTrill_x.length);

    /************ALLURING STAR TATTOO****************************/
    int [] star_x = {
        321,310,285,301,295,295,309,322,335,354,
        344,361,335,321
    };
    int [] star_y = {
        293,314,312,334,354,367,359,350,358,369,
        338,319,315,293
    };
    g.setColor(Color.YELLOW);/*******YELLOW************/
    g.fillPolygon(star_x, star_y, star_x.length);
    g.setColor(Color.BLACK); /************BLACK*****************/

    int [] star1_x = {
        321,310,285,301,295,295,309,322,335,354,
        344,361,335,321
    };
    int [] star1_y = {
        293,314,312,334,354,367,359,350,358,369,
        338,319,315,293
    };
    g.drawPolyline(star1_x, star1_y, star1_x.length);

    /**************BEWITCHING TEARDROP TATTOO***************************/
    int [] teardrop_x = {
        537,535,528,523,522,521,525,530,535,542,
        553,554,553,549,543,537
    };
    int [] teardrop_y = {
        295,301,333,355,366,371,378,382,383,383,
        373,365,359,341,318,295
    };
    g.setColor(Color.RED);/*********RED*********/
    g.fillPolygon(teardrop_x, teardrop_y, teardrop_x.length);
    g.setColor(Color.BLACK); /************BLACK*****************/

    int [] teardrop1_x = {
        537,535,528,523,522,521,525,530,535,542,
        553,554,553,549,543,537
    };
    int [] teardrop1_y = {
        295,301,333,355,366,371,378,382,383,383,
        373,365,359,341,318,295
    };
    g.drawPolyline(teardrop1_x, teardrop1_y, teardrop1_x.length);

    /*************BLOOD THIRSTY SMILING LIPS*****************************/
    int [] lips_x = {
        347,343,368,384,394,409,422
    };
    int [] lips_y = {
        421,425,437,437,436,439,445
    };
    g.drawPolyline(lips_x, lips_y, lips_x.length);

    int [] lips1_x = {
        421,436
    };
    int [] lips1_y = {
        435,436
    };
    g.drawPolyline(lips1_x, lips1_y, lips1_x.length);

    int [] lips2_x = {
        436,456,473,505,517,516
    };
    int [] lips2_y = {
        445,441,439,439,430,426
    };
    g.drawPolyline(lips2_x, lips2_y, lips2_x.length);

    int [] lips3_x = {
        375,392,418,438,451,473
    };
    int [] lips3_y = {
        452,456,461,462,463,460
    };
    g.drawPolyline(lips3_x, lips3_y, lips3_x.length);

    /**************INDESTRUCTIBLE NECK LINE*******************/
    int [] neck_x = {
        270,270,273,275,278,304,354,374
    };
    int [] neck_y = {
        395,415,447,473,498,511,529,534
    };
    g.drawPolyline(neck_x, neck_y, neck_x.length);

    int [] neck1_x = {
        478,535,551,578,582,586
    };
    int [] neck1_y = {
        541,521,512,494,457,403
    };
    g.drawPolyline(neck1_x, neck1_y, neck1_x.length);

    /*************CLOSED NECK FASHION STATEMENT************/
    int [] cNeck_x = {
        273,255,242,236,220,204,204,213,230,254,
        294,333,375,407,459,488,519,543,577,600,
        616,630,639,643,643,641,637,630,617,603,
        583,579,478,454,405,374,315,278
    };  
    int [] cNeck_y = {
        450,457,468,483,538,604,609,627,646,664,
        689,705,713,714,713,711,702,693,678,664,
        650,634,624,616,599,586,561,537,494,470,
        458,493,542,567,565,535,515,498
    };
    g.fillPolygon(cNeck_x, cNeck_y, cNeck_x.length);

    int [] cNeck1_x = {
        404,408,459,455
    };
    int [] cNeck1_y = {
        568,714,712,568
    };
    g.setColor(Color.WHITE); /************WHITE***********/
    g.fillPolygon(cNeck1_x, cNeck1_y, cNeck1_x.length);

    /***********THAT YELLOW LONG THING***********************/
    int [] yellow_x = {
        223,206,181,158,147,144,146,159,170,185,
        196,212,218,205,204,223,247,274,305,337,
        375,405,477,489,512,532,559,586,613,626,
        640,644,644,644,641,638,635,631,631,643,
        654,672,683,689,700,701,699,690,682,668,
        644,626
    };
    int [] yellow_y = {
        719,706,679,647,619,592,582,556,546,537,
        534,535,538,600,610,639,661,679,695,707,
        714,715,713,712,705,698,687,673,653,640,
        624,615,604,595,583,568,551,538,536,533,
        534,541,551,559,591,623,633,656,668,687,
        708,719
    };
    g.setColor(Color.YELLOW); /**********YELLOW*****/
    g.fillPolygon(yellow_x, yellow_y, yellow_x.length);

    int [] yellow1_x = {
        223,206,181,158,147,144,146,159,170,185,
        196,212,218,205,204,223,247,274,305,337,
        375,405,477,489,512,532,559,586,613,626,
        640,644,644,644,641,638,635,631,631,643,
        654,672,683,689,700,701,699,690,682,668,
        644,626
    };
    int [] yellow1_y = {
        719,706,679,647,619,592,582,556,546,537,
        534,535,538,600,610,639,661,679,695,707,
        714,715,713,712,705,698,687,673,653,640,
        624,615,604,595,583,568,551,538,536,533,
        534,541,551,559,591,623,633,656,668,687,
        708,719
    };
    g.setColor(Color.BLACK); /**********BLACK**********/
    g.drawPolyline(yellow1_x, yellow1_y, yellow1_x.length);
    
    /**************BUFFED STIFFED STRONG SHOULDERS*****************/
    int [] shoulder_x = {
        143,146,147,152,160,173,190,200,212,223,0,0,39,80,116
    };
    int [] shoulder_y = {
        593,616,625,633,650,669,691,702,711,720,720,646,628,614,601
    };
    g.fillPolygon(shoulder_x, shoulder_y, shoulder_x.length);

    int [] shoulder1_x = {
        630,658,673,684,692,699,702,702,792,863,855,847,840,803
    };
    int [] shoulder1_y = {
        720,700,684,669,650,634,625,591,619,639,657,683,704,720
    };
    g.fillPolygon(shoulder1_x, shoulder1_y, shoulder1_x.length);

    /***********YU-GI-OH MAGIC F***ING CARD*************************/
    int [] card_x = {
        869,1170,1161,1142,1091,1086,1084,1079,1075,1073,
        1076,1077,1072,1071,1065,1058,1053,1047,1041,1034,
        1021,1016,1011,1013,1011,1011,1012,1012,1007,1004,
        1002,863,858
    };
    int [] card_y = {
        135,135,583,592,595,519,507,486,446,431,
        381,344,329,314,296,287,288,296,317,324,
        356,379,402,438,474,498,519,526,554,583,
        595,595,590
    };
    g.setColor(Color.BLACK); /************BLACK***********/
    g.drawPolygon(card_x, card_y, card_x.length);

    int [] card1_x = {
        881,1157,1147,1090,1086,1084,1079,1075,1073,
        1076,1077,1072,1071,1065,1058,1053,1047,1041,1034,
        1021,1016,1011,1013,1011,1011,1012,1012,1007,1004,
        1002,870
    };
    int [] card1_y = {
        145,143,582,583,519,507,486,446,431,
        381,344,329,314,296,287,288,296,317,324,
        356,379,402,438,474,498,519,526,554,583,
        584,585
    };
    g.setColor(Color.PINK); /**********PINK***********/
    g.fillPolygon(card1_x, card1_y, card1_x.length);

    /***********FINGER OF DEATH***************************/
    int [] finger_x ={
        1042,1038,1037,1037,1038,1041
    };
    int [] finger_y = {
        314,330,351,362,370,380
    };
    g.setColor(Color.BLACK); /************BLACK***********/
    g.drawPolyline(finger_x, finger_y, finger_x.length);

    int [] finger1_x ={
        1068,1070,1071,1071
    };
    int [] finger1_y = {
        372,358,347,330
    };
    g.drawPolyline(finger1_x, finger1_y, finger1_x.length);
    
    int [] finger2_x ={
        1047,1065
    };
    int [] finger2_y = {
        521,523
    };
    g.drawPolyline(finger2_x, finger2_y, finger2_x.length);

    int [] finger3_x ={
        1002,1004,1007,1008,1018
    };
    int [] finger3_y = {
        596,653,679,685,700
    };
    g.drawPolyline(finger3_x, finger3_y, finger3_x.length);

    int [] finger4_x ={
        1006,1007,1016
    };
    int [] finger4_y = {
        687,700,720
    };
    g.drawPolyline(finger4_x, finger4_y, finger4_x.length);

    int [] finger5_x ={
        992,994,997
    };
    int [] finger5_y = {
        702,711,720
    };
    g.drawPolyline(finger5_x, finger5_y, finger5_x.length);

    int [] finger6_x ={
        930,931,928,924,922,921,916,910
    };
    int [] finger6_y = {
        596,607,624,647,671,697,708,720
    };
    g.drawPolyline(finger6_x, finger6_y, finger6_x.length);

    int [] finger7_x ={
        920,912,877,865,860,855,845,834
    };
    int [] finger7_y = {
        635,632,633,639,649,660,693,720
    };
    g.drawPolyline(finger7_x, finger7_y, finger7_x.length);

    int [] finger8_x ={
        839,806
    };
    int [] finger8_y = {
        706,720
    };
    g.drawPolyline(finger8_x, finger8_y, finger8_x.length);

    int [] finger9_x ={
        860,865,875
    };
    int [] finger9_y = {
        720,716,717
    };
    g.drawPolyline(finger9_x, finger9_y, finger9_x.length);

    int [] finger10_x ={
        1088,1094,1093,1101,1106,1110,1110
    };
    int [] finger10_y = {
        594,673,674,689,701,715,720
    };
    g.drawPolyline(finger10_x, finger10_y, finger10_x.length);

    int [] finger11_x ={
        1091,1094,1094
    };
    int [] finger11_y = {
        696,705,720
    };
    g.drawPolyline(finger11_x, finger11_y, finger11_x.length);

    int [] finger12_x ={
        1106,1133,1138
    };
    int [] finger12_y = {
        699,711,720
    };
    g.drawPolyline(finger12_x, finger12_y, finger12_x.length);

    int [] finger13_x ={
        1173,1168,1161,1149,1135,1127,1124,1125,1129,1132,
        1138,1145
    };
    int [] finger13_y = {
        595,588,584,588,605,626,651,675,692,704,
        714,720
    };
    g.drawPolyline(finger13_x, finger13_y, finger13_x.length);

    int [] finger14_x ={
        1174,1179,1183,1194,1199,1207,1211
    };
    int [] finger14_y = {
        628,642,656,687,702,711,720
    };
    g.drawPolyline(finger14_x, finger14_y, finger14_x.length);

    int [] finger15_x = {
        1091,1086,1084,1079,1075,1073,
        1076,1077,1072,1071,1065,1058,1053,1047,1041,1034,
        1021,1016,1011,1013,1011,1011,1012,1012,1007,1004,
        1002
    };
    int [] finger15_y = {
        595,519,507,486,446,431,
        381,344,329,314,296,287,288,296,317,324,
        356,379,402,438,474,498,519,526,554,583,
        595
    };
    g.drawPolyline(finger15_x, finger15_y, finger15_x.length);
    
    /********BACKGROUND*******/
    int [] bg_x = {
        0,49,91,128,136,146,159,184,205,
        228,241,262,267,259,249,229,203,178,175,
        174,170,181,175,164,141,142,136,110,98,
        94,0
    };
    int [] bg_y = {
        637,618,602,590,584,554,538,531,527,
        487,461,445,438,376,360,354,304,274,261,
        223,194,175,163,157,123,74,56,29,16,
        0,0
    };
    g.fillPolygon(bg_x, bg_y, bg_x.length);

    int [] bg1_x = {
        740,742,727,713,712,713,678,688,682,654,
        632,602,594,590,614,633,641,670,696,
        708,865,915,923,855,857,860,1179,1173,
        1184,1192,1207,1219,1280,1280
    };
    int [] bg1_y = {
        0,17,45,86,98,113,170,198,274,306,
        342,363,405,447,469,507,523,532,557,
        583,626,626,605,603,391,130,128,583,
        604,651,698,720,720,0
    };
    g.fillPolygon(bg1_x, bg1_y, bg1_x.length);

    int [] bg2_x = {
        1093,1131,1122,1121,1120,1129,1109,1097
    };
    int [] bg2_y = {
        599,600,620,656,677,701,693,674
    };
    g.fillPolygon(bg2_x, bg2_y, bg2_x.length);

    /**********SIGNATURE*************/
    int [] sign_x = {
        939,930,921,910,909,914,925,934,940,946,
        953,960,972,975,987,995,999,1003,1004,1004,
        1012,1013,1018,1026,1034,1035,1031,1024,1023,1030,
        1040,1044,1046,1047,1055,1055,1061,1071,1074,1081,
        1083,1085,1085,1092,1096,1099,1102,1109,1114,1115,
        1109,1102,1103,1118
    };
    int [] sign_y = {
        192,182,181,190,216,230,242,239,236,231,
        223,220,231,237,221,229,231,227,238,233,
        227,239,239,235,232,228,225,225,230,240,
        240,235,233,225,225,240,239,227,240,229,
        228,241,234,229,233,241,238,241,238,231,
        226,229,239,224
    };
    g.drawPolyline(sign_x, sign_y, sign_x.length);

    g.drawLine(946, 231, 952, 235);
    g.drawLine(952, 235, 959, 239);
    g.drawLine(959, 239, 967, 237);
    g.drawLine(967, 237, 971, 230);
    g.drawLine(995, 229, 994, 240);
    g.fillOval(1070, 210, 5, 5);
    /***************FULL NAME YEAR & SECTION*************/
    g.drawString("CAMERINO, PAUL JOSHUA R.", 911, 250);
    g.drawString("BSIT 4-C", 911, 260);
    g.drawString("COSC65", 911, 270);

    /**********************************HUNTERxHUNTER GROUP LOGO****************/
    int [] upperH_x = {
        7,20,20,24,24,51,52,55,56,83,
        86,87,176,180,185,185,182,189,174,171,
        170,69,61,47,39,38,38,24,
        24,20,20,7
    };
    int [] upperH_y = {
        34,34,50,50,40,40,63,63,40,40,
        44,40,39,41,45,56,61,74,75,70,
        75,74,75,76,68,68,76,76,
        64,64,76,76
    };
    g.setColor(Color.RED); //SET COLOR RED
    g.fillPolygon(upperH_x, upperH_y, upperH_x.length); //UPPER RED HUNTER SHADOW

    int [] lowerH_x = {
        7,20,20,24,24,38,38,39,46,61,
        68,69,170,170,173,189,182,186,186,178,
        87,87,83,56,56,54,52,52,24,24,
        20,20,7
    };
    int [] lowerH_y = {
        76,76,87,87,76,76,83,84,76,76,
        82,76,76,81,76,76,90,95,104,111,
        111,107,111,111,89,88,89,111,111,101,
        101,111,111
    };

    g.fillPolygon(lowerH_x, lowerH_y, lowerH_x.length); //LOWER RED HUNTER SHADOW

    int [] uH_x = {
        9,18,18,26,26,36,36,26,26,18,18,9
    };
    int [] uH_y = {
        37,37,53,53,43,43,73,73,61,61,73,73
    };
    g.setColor(Color.WHITE); //SET COLOR WHITE
    g.fillPolygon(uH_x, uH_y, uH_x.length); //UPPER H

    int [] uU_x = {
        40,49,49,52,55,58,58,66,66,59,50,41
    };
    int [] uU_y = {
        42,42,63,67,67,64,42,42,66,73,73,67
    };

    g.fillPolygon(uU_x, uU_y, uU_x.length); //UPPER U

    int [] uN_x = {
        71,82,90,90,97,97,86,79,79,71
    };
    int [] uN_y = {
        42,42,60,42,42,71,71,54,71,71
    };

    g.fillPolygon(uN_x, uN_y, uN_x.length); //UPPER N

    int [] uT_x = {
        103,127,127,119,119,115,111,111,103
    };
    int [] uT_y = {
        42,42,49,49,64,67,64,49,49
    };

    g.fillPolygon(uT_x, uT_y, uT_x.length); //UPPER T

    int [] white_hashira_x = {
        100,108,108,100
    };
    int [] white_hashira_y = {
        52,52,100,100
    };
    
    g.fillPolygon(white_hashira_x, white_hashira_y, white_hashira_x.length); //RANDOM WHITE PILLAR BESIDE UPPER T

    int [] white_hashira1_x = {
        122,129,129,122
    };
    int [] white_hashira1_y = {
        52,52,100,100
    };
    
    g.fillPolygon(white_hashira1_x, white_hashira1_y, white_hashira1_x.length); //RANDOM WHITE PILLAR BESIDE UPPER T

    int [] uE_x = {
        132,153,153,141,141,151,151,141,141,155,155,133
    };
    int [] uE_y = {
        42,42,49,49,53,54,60,60,66,66,72,72
    };
    
    g.fillPolygon(uE_x, uE_y, uE_x.length); //UPPER E

    int [] uR_x = {
        160,176,183,183,178,185,175,170,168,168,160
    };
    int [] uR_y = {
        42,42,47,54,60,72,72,62,62,72,72
    };

    g.fillPolygon(uR_x, uR_y, uR_x.length); //UPPER R

    //upper R hole   
    int [] upperR_x = {
        167,173,175,173,167
    };
    int [] upperR_y = {
        49,49,51,55,55
    };
    g.setColor(Color.RED); //SET COLOR RED
    g.fillPolygon(upperR_x, upperR_y, upperR_x.length); //UPPER R HOLE

    int [] bb_x = {
        78,150,150,78
    };
    int [] bb_y = {
        72,72,80,80
    };
    g.setColor(Color.BLACK); //SET COLOR BLACK
    g.fillPolygon(bb_x, bb_y, bb_x.length); //BLACK BAR

    int [] xShadow_x = {
        105,115,125,131,122,132,125,115,105,97,108,98
    };
    int [] xShadow_y = {
        58,68,59,64,75,85,93,83,93,86,76,67
    };
    g.setColor(Color.YELLOW); //SET COLOR YELLOW
    g.fillPolygon(xShadow_x, xShadow_y, xShadow_x.length);

    int [] x_x = {
        105,115,124,129,120,129,125,115,105,100,110,101
    };
    int [] x_y = {
        61,70,60,64,75,85,90,80,90,86,75,66
    };
    g.setColor(Color.GREEN); //SET COLOR GREEN
    g.fillPolygon(x_x, x_y, x_x.length); //X

    int [] lH_x = {
        9,18,18,26,26,35,35,27,27,19,18,9
    };
    int [] lH_y = {
        79,79,91,91,79,79,109,109,99,99,109,109
    };
    g.setColor(Color.ORANGE); //SET COLOR ORANGE
    g.fillPolygon(lH_x, lH_y, lH_x.length); //LOWER INVERTED H

    int [] lU_x = {
        41,41,45,49,57,65,66,59,59,56,52,49,49
    };
    int [] lU_y = {
        109,86,80,78,78,86,109,109,89,85,85,88,109
    };

    g.fillPolygon(lU_x, lU_y, lU_x.length); //LOWER INVERTED U

    int [] lN_x = {
        71,79,79,86,97,97,90,90,81,71
    };
    int [] lN_y = {
        79,79,97,81,81,109,109,91,109,109
    };
    
    g.fillPolygon(lN_x, lN_y, lN_x.length); //LOWER INVERTED N


    int [] lT_x = {
        110,114,119,119,126,127,103,103,110
    };
    int [] lT_y = {
        87,84,87,103,103,109,109,103,103
    };

    g.fillPolygon(lT_x, lT_y, lT_x.length); //LOWER INVERTED T
    
    int [] lE_x = {
        133,154,154,141,141,151,151,141,141,153,153,133
    };
    int [] lE_y = {
        81,81,86,86,91,91,97,98,102,102,109,109
    };

    g.fillPolygon(lE_x, lE_y, lE_x.length); //LOWER INVERTED E

    int [] lR_x = {
        159,167,167,170,175,183,177,182,183,177,159
    };
    int [] lR_y = {
        79,79,90,90,79,79,92,95,102,109,109
    };

    g.fillPolygon(lR_x, lR_y, lR_x.length); //LOWER INVERTED R

    //lower R hole
    int [] lowerR_x = {
        167,173,175,172,168
    };
    int [] lowerR_y = {
        97,97,100,103,103
    };
    g.setColor(Color.RED); //SET COLOR RED
    g.fillPolygon(lowerR_x, lowerR_y, lowerR_x.length); //LOWER R HOLE


    g.setColor(Color.YELLOW); //SET COLOR YELLOW
    
    g.drawLine(81, 77, 83, 74); //JAPANESE CHARACTERS
    g.drawLine(84, 75, 85, 78); //JAPANESE CHARACTERS
    g.drawLine(88, 74, 88, 74); //JAPANESE CHARACTERS
    g.drawLine(87, 79, 91, 75); //JAPANESE CHARACTERS
    g.drawLine(93, 75, 96, 75); //JAPANESE CHARACTERS
    g.drawLine(96, 76, 93, 79); //JAPANESE CHARACTERS
    g.drawLine(98, 76, 102, 77); //JAPANESE CHARACTERS
    g.drawLine(128, 77, 130, 74); //JAPANESE CHARACTERS
    g.drawLine(130, 75, 132, 77); //JAPANESE CHARACTERS
    g.drawLine(134, 79, 138, 75); //JAPANESE CHARACTERS
    g.drawLine(133, 74, 135, 75); //JAPANESE CHARACTERS
    g.drawLine(140, 76, 143, 75); //JAPANESE CHARACTERS
    g.drawLine(143, 76, 140, 78); //JAPANESE CHARACTERS
    g.drawLine(144, 76, 149, 77); //JAPANESE CHARACTERS

}
}