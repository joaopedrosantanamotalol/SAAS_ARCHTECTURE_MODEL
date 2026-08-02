import { View, Text, Pressable } from "react-native";
import { style } from "./style";

type Props = {
    titleWhite: string,
};

export function SmallButton({
    titleWhite,
}: Props){
    return (
        <Pressable>
            {({ pressed }) => (
                <View
                    style={[
                        style.canvas_body,
                        {
                            backgroundColor: pressed 
                                ? "#FFFFFF50" 
                                : "#FFFFFF00",
                        },
                    ]}
                >
                    <Text style={style.titulo}>
                        {titleWhite}
                    </Text>
                </View>
            )}
        </Pressable>
    );
}