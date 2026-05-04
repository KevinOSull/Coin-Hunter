package strategy;

import Entities.Monster;
import GameLogic.Position;
import board.Board;
import com.googlecode.lanterna.gui2.Direction;

public interface MovementStrategy {

    Position move(Monster monster, Board board, Direction playerDirection);
}
