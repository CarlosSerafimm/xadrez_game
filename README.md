# Jogo de Xadrez

Este repositório contém uma implementação de um jogo de xadrez em Java.

## 📖 Descrição

Este projeto visa proporcionar uma experiência completa de xadrez, permitindo que dois jogadores disputem partidas seguindo as regras tradicionais do jogo. A interface é baseada em linha de comando, oferecendo uma representação textual do tabuleiro e das peças.

## 🚀 Funcionalidades

- ✅ **Movimentação das peças**: Implementa as regras de movimento para todas as peças do xadrez.
- ✅ **Detecção de xeque e xeque-mate**: O jogo identifica situações de xeque e xeque-mate, conforme as regras oficiais.
- ✅ **Promoção de peão**: Quando um peão atinge a última fileira, o jogador pode promovê-lo a outra peça (rainha, torre, bispo ou cavalo).
- ✅ **Roque**: Suporta o movimento especial de roque, tanto do lado do rei quanto da rainha.
- ✅ **Captura en passant**: Implementa a regra especial de captura "en passant" para peões.

### ✅ Pré-requisitos

Certifique-se de ter o [Java Development Kit (JDK)] instalado em sua máquina.

### 📥 Clonar o repositório

```bash
git clone https://github.com/CarlosSerafimm/xadrez_game.git
cd xadrez_game
```

## 🎮 Como Jogar

1. **Início**: Ao iniciar o jogo, o tabuleiro será exibido no console com a posição inicial das peças.
2. **Movimentos**: Os jogadores devem inserir os movimentos no formato `e2 e4`, onde `e2` é a posição inicial da peça e `e4` é a posição de destino.
3. **Turnos**: O jogo alterna automaticamente entre os jogadores após cada movimento válido.
4. **Condições de vitória**: O jogo termina quando um dos reis está em xeque-mate ou ocorre um empate conforme as regras oficiais do xadrez.

