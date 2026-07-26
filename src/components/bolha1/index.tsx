import { Animated, Dimensions } from "react-native";
import { useEffect, useRef } from "react";

const { height, width } = Dimensions.get("window");

const eixo_y = height * 1;
const eixo_x = width * 0.1;

export function Bolha() {
  const animacao = useRef(new Animated.Value(0)).current;

  useEffect(() => {
    Animated.loop(
      Animated.sequence([
        Animated.timing(animacao, {
          toValue: 1,
          duration: 8000,
          useNativeDriver: true,
        }),
        Animated.timing(animacao, {
          toValue: 0,
          duration: 6000,
          useNativeDriver: true,
        }),
      ])
    ).start();
  }, []);

  const movimentoY = animacao.interpolate({
    inputRange: [0, 1],
    outputRange: [0, -40],
  });

  const rotacao = animacao.interpolate({
    inputRange: [0, 1],
    outputRange: ["-15deg", "25deg"],
  });

  return (
    <Animated.View
      style={{
        width: 200,
        height: 120,

        borderTopLeftRadius: 200,
        borderTopRightRadius: 60,
        borderBottomLeftRadius: 30,
        borderBottomRightRadius: 160,

        backgroundColor: "#442F74",
        opacity: 0.5,
        top: eixo_y,
        left:-eixo_x,
        transform: [
          { translateY: movimentoY },
          { rotate: rotacao },
        ],
      }}
    />
  );
}