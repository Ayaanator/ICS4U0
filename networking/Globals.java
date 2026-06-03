public class Globals {
  // Network constants
  public static final int NET_OK = 0;
  public static final int NET_SEND_ERROR = -1;
  public static final int NET_RECEIVE_ERROR = -2;
  public static final int PORT_NUMBER = 5000;
  public static final int TIME_OUT = 30000; 
  public static final int SENDING_ATTEMPTS_LIMIT = 4;
  public static final int QUEUE_SIZE = 100;

  public static final int FRAME_X = 275;
  public static final int FRAME_Y = 275;

  public static final String serverIPAddress = "192.168.0.104";

  // Commands to send to server
  public static final char REQUEST_UNKNOWN = 255;
  public static final char REQUEST_TO_PLAY_GAME = 245; // client to server
  public static final char REQUEST_TO_PROCESS_PLAY = 244; // client to server
  public static final char COMMAND_GAME_TERMINATE = 243; // server to client
  public static final char COMMAND_TO_WAIT = 242; // server to client
  public static final char COMMAND_TO_START_GAME = 241; // server to client
  public static final char COMMAND_YOUR_TURN = 240; // server to client
  public static final char COMMAND_GAME_OVER = 239; // server to client
  public static final char COMMAND_DISPLAY_MESSAGE = 238; //server to client
  public static final char REQUEST_TO_DISCONNECT = COMMAND_GAME_TERMINATE; //client to server
  
  public static final int CLIENT_ID_LENGTH = 15;
  public static final String NO_MESSAGE = "No message"; 

  // Graphics constants
  public static final int ROW_HEIGHT = 175;
  public static final int COL_WIDTH = 175;

  // Game constants and variables
  public static final int NO_PLAYER = 0;
  public static final int PLAYER_ONE = 1;
  public static final int PLAYER_TWO = 2;

  public static boolean gameOver = false;
  public static int currentPlayer = NO_PLAYER;
  public static int me = NO_PLAYER;

  public static final int ROWS = 3;
  public static final int COLS = 3;
  public static GridPanel[][] grid = new GridPanel[ROWS][COLS];
}