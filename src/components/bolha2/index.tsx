import { Animated, Dimensions } from "react-native";
import { useEffect, useRef } from "react";

const { height, width } = Dimensions.get("window");

const eixo_y = height * 0.05;
const eixo_x = width * 0.55;

export function Bolha2() {
  const animacao = useRef(new Animated.Value(0)).current;

  useEffect(() => {
    Animated.loop(
      Animated.sequence([
        Animated.timing(animacao, {
          toValue: 1,
          duration: 7000,
          useNativeDriver: true,
        }),
        Animated.timing(animacao, {
          toValue: 0,
          duration: 7000,
          useNativeDriver: true,
        }),
      ])
    ).start();
  }, []);


  const movimentoY = animacao.interpolate({
    inputRange:[0,1],
    outputRange:[0,-70],
  });


  const movimentoX = animacao.interpolate({
    inputRange:[0,1],
    outputRange:[0,40],
  });


  const rotacao = animacao.interpolate({
    inputRange:[0,1],
    outputRange:["35deg","-20deg"],
  });


  return (
    <Animated.View
      style={{
        position:"absolute",

        width:260,
        height:170,

        borderTopLeftRadius:80,
        borderTopRightRadius:220,
        borderBottomLeftRadius:150,
        borderBottomRightRadius:40,

        backgroundColor:"#442F74",
        opacity:0.5,

        top:-eixo_y,
        left:eixo_x,
        elevation:0,
        transform:[
          {translateX: movimentoX},
          {translateY: movimentoY},
          {rotate: rotacao},
        ],
      }}
    />
  );
}