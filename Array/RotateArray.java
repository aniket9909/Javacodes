package Array;

import javax.swing.text.Position;

// ) Write a program in C to rotate an array by N positions ?
public class RotateArray {
  public static void main(String[] args) {
    int[] arr = {

        512339, 412290, 624800, 973550, 538459, 59401, 525355, 720999, 870472, 453185, 633719, 167280, 484667, 359294,
        619059, 723719, 687382, 737245, 303464, 316826, 639411, 882893, 587816, 688621, 489691, 381238, 790387, 547874,
        82695, 219167, 404299, 405834, 22976, 760681, 296961, 398961, 864731, 176759, 791078, 627747, 758289, 782757,
        699125, 46689, 928784, 963346, 893264, 171886, 741826, 447584, 78263, 945683, 885955, 365139, 532760, 279747,
        52689, 344185, 381773, 708245, 574066, 470105, 286994, 257732, 964143, 344215, 694958, 607628, 908752, 130826,
        184073, 717613, 92468, 454365, 677012, 435374, 386178, 484296, 502340, 192821, 907714, 28414, 314088, 93589,
        716516, 934234, 84716, 135590, 953427, 345122, 662891, 590591, 277797, 230926, 668880, 336360, 382847, 675137,
        831898, 344974, 448713, 174424, 326723, 21777, 819481, 390703, 47485, 168574, 711266, 342156, 448620, 308084,
        266062, 330540, 220808, 84959, 841011, 518323, 783620, 387014, 490662, 236252, 452060, 213390, 110142, 857342,
        543549, 800045, 250955, 411079, 480326, 528303, 287107, 548427, 922106, 814698, 397846, 659224, 530019, 760193,
        518554, 901443, 42235, 471893, 186997, 884175, 84797, 370438, 201648, 989379, 180362, 944224, 316941, 9256,
        937919, 142349, 443223, 428789, 136675, 689567, 591904, 689108, 64221, 128660, 711687, 968043, 293323, 434149,
        396483, 44839, 912041, 738745, 589484, 224978, 81748, 434543, 35196, 261973, 160504, 456336, 529576, 351290,
        63685, 711769, 241488, 495589, 504453, 194073, 27619, 679613, 290582, 703474, 567991, 834514, 223293, 328058,
        962861, 415683, 409587, 731921, 885821, 699922, 840883, 114468, 687718, 238889, 215627, 673319, 201503, 330874,
        587868, 449254, 806887, 634976, 977977, 167425, 37588, 466599, 274866, 45647, 420961, 914487, 869938, 173444,
        314230, 875331, 921990, 843569, 457914, 689931, 108119, 913027, 421128, 971422, 771374, 685676, 909999, 400373,
        288355, 123058, 713857, 719214, 334280, 635725, 644111, 862576, 37396, 853109, 774952, 612334, 651238, 912472,
        143213, 976539, 104212, 945483, 634839, 446352, 477064, 787216, 969180, 978009, 598779, 473706, 591749, 171730,
        23893, 20061, 517104, 406407, 833956, 168978, 981901, 697299, 708037, 717863, 526164, 584902, 453833, 315428,
        584094, 371006, 298708, 973421, 453386, 771109, 261827, 632065, 892761, 661683, 86667, 829993, 679300, 998426,
        86300, 63122, 973245, 757013, 279192, 39879, 612533, 52312, 364858, 612782, 412588, 31146, 240786, 350901,
        467448, 712473, 294861, 848311, 90933, 45507, 10168, 452854, 156141, 945157, 272924, 434404, 54690, 773166,
        18086, 588071, 457857, 805619, 698691, 10654, 69203, 51764, 264822, 843351, 979667, 131283, 436502, 206559,
        94067, 939737, 447809, 935654, 805064, 241970, 208922, 274354, 170243, 615897, 811747, 3636, 643227, 275252,
        823774, 69602, 742732, 803737, 298808, 79124, 65383, 296803, 358092, 977645, 188680, 861783, 498823, 613269,
        893757, 664516, 77155, 72877, 145148, 234720, 907438, 942755, 39819, 8994, 112229, 600854, 551976, 133677,
        210159, 233288, 359025, 901320, 59895, 382133, 648084, 811977, 303964, 534632, 486111, 425286, 963088, 150028,
        44419, 147580, 736294, 358080, 970779, 540946, 156469, 209951, 126422, 582733, 914544, 398061, 84177, 62275,
        722972, 308985, 48983, 311875, 989824, 815909, 295825, 741891, 962554, 261359, 98704, 974851, 992282, 53040,
        432921, 676022, 883474, 448616, 803154, 557077, 726784, 585894, 292182, 423064, 419370, 791799, 783113, 801936,
        531613, 395712, 395637, 138296, 712456, 282002, 256716, 150879, 593098, 729314, 593871, 230013, 450573, 588062,
        208453, 121070, 621089, 342846, 376258, 469103, 95458, 6827, 521969, 860908, 299630, 968414, 284102, 36218,
        141477, 233819, 47432, 199286, 704285, 684952, 369913, 112708, 791645, 775888, 857503, 240917, 854609, 453002,
        995692, 624633, 847798, 600589, 865005, 555045, 321926, 653891, 53808, 580262, 669013, 257901, 249313, 756541,
        326967, 918076, 295229, 838482, 869441, 532731, 378325, 851294, 397545, 113870, 450663, 678450, 37325, 808006,
        243627, 83291, 884124, 280432, 947933, 466775, 947876, 340765, 609660, 600710, 38570, 745224, 150520, 984342,
        560168, 158134, 318958, 796413, 83219, 776301, 880313, 203303, 902884, 990901, 319218, 772529, 978136, 848130,
        45103, 310582, 277115, 990091, 696219, 260534, 587600, 601904, 626676, 590052, 705567, 846012, 535750, 352689,
        786666, 558917, 5879, 386132, 795185, 830813, 188926, 303578, 940902, 141785, 908448, 329450, 928869, 178174,
        791116, 694695, 574083, 322602, 837941, 317349, 935916, 107050, 868500, 84832, 75085, 371514, 233425, 916618,
        727330, 801087, 724661, 213534, 594149, 239087, 718396, 269381, 635945, 199724, 589045, 896632, 888466, 703526,

        457482, 893983, 179948, 489297, 100994, 45342, 827649, 802773, 877510, 322990, 345723, 297997, 922873, 533615,
        301567, 546861, 215109, 238741, 624573, 872413, 617425, 455739, 509672, 659631, 132100, 385173, 877092, 497087,
        518315, 1110, 52947, 750899, 188607, 819840, 820385, 188903 };
    int position = 5545;
    // rotate(arr, position);
    backToFrontRotate(arr, position);
  }

  public static void rotate(int[] arr, int position) {
    int[] temp = new int[position + 1];
    int count1 = position, count2 = 0;
    for (int i = 0; i < temp.length; i++) {
      temp[i] = arr[i];
    }
    for (int i = 0; i < arr.length; i++) {
      if (i > arr.length - 1 - position && count2 < temp.length) {
        arr[i] = temp[count2++];
        // System.out.println(arr[i]);
      } else {
        arr[i] = arr[count1];
        // System.out.println(count1);
        count1++;
      }
    }
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  public static void backToFrontRotate(int[] arr, int position) {
    // // int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
    // if (arr.length > 1) {
    // int[] temp = new int[position];
    // int templength = position;
    // int arrLength = arr.length, j = 0;
    // int count1 = arrLength - position;

    // for (int i = count1; i < arrLength; i++) {
    // temp[j++] = arr[i];
    // }

    // for (int i = arrLength - 1; i >= 0; i--) {
    // if (count1 != 0) {
    // arr[i] = arr[--count1];
    // } else {
    // arr[i] = temp[--templength];
    // }
    // }

    // for (int i : arr) {
    // System.out.println(i);
    // }

    // } else {
    // System.out.println(arr[0]);
    // }
    int temp = 0;
    for (int i = 0; i < position; i++) {
      temp = arr[arr.length - 1];
      for (int j = arr.length - 1; j >= 0; j--) {
        if (j == 0) {
          arr[j] = temp;
        } else {
          arr[j] = arr[j - 1];
        }
      }
    }
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

}
