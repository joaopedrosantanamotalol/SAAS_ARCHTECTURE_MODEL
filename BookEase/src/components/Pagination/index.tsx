import { View } from "react-native";
import { styles } from "./styles"

type Props = {
    page: number;
}

export function Pagination({ page }: Props) {
    return (
        <View style={styles.container}>
            {[0, 1, 2].map((index) => (
                <View
                    key={index}
                    style={[
                        styles.dot,
                        page === index && styles.activeDot,
                    ]}
                />
            ))}
        </View>
    )
}
